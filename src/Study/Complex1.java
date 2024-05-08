package Study;

public class Complex1 {
    private double real;
    private double imag;
    public Complex1(double r, double i){
        real = r;
        imag = i;
    }
    double getReal(){
        return real;
    }
    double getImag(){
        return imag;
    }
    public Complex1 add(Complex1 c){
        double resultReal = real + c.getReal();
        double resultImag = imag + c.getImag();
        return new Complex1(resultReal, resultImag);
    }
}
