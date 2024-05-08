package Study;

public class Complex3 {
    double real;
    double imag;
    public Complex3(double r, double i){
        real = r;
        imag = i;
    }
    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }
    public Complex3 add(Complex3 c){
        double resultReal = real + c.getReal();
        double resultImag = imag + c.getImag();
        return new Complex3(resultReal, resultImag);
    }

    public static void main(String[] args){
        Complex3 c1 = new Complex3(10, 20);
        Complex3 c2 = new Complex3(5, 15);
        Complex3 t = c1.add(c2);
        System.out.printf("Real is %.2f, Imag is %.2f", t.getReal(), t.getImag());
    }
}
