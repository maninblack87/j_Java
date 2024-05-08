package Study;

public class Complex2 {
    double real;
    double imag;
    public Complex2(double r, double i){
        real = r;
        imag = i;
    }
    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }
    public Complex2 add(Complex2 c){
        double resultReal = real + c.getReal();
        double resultImag = imag + c.getImag();
        return new Complex2(resultReal, resultImag);
    }
}
