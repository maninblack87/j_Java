package Study;

public class Complex {
    private double real;
    private double imag;
    public Complex(double r, double i){
        real = r;
        imag = i;
    }
    double getReal(){
        return real;
    }
    double getImag(){
        return imag;
    }
    public Complex add(Complex c){
        double resultReal = real + c.getReal();
        double resultImag = imag + c.getImag();
        return new Complex(resultReal, resultImag);
    }
    
    public static void main(String[] args) {
        Complex c1, c2, total;
        c1 = new Complex(7, 5);
        c2 = new Complex(8, 2);
        total = new Complex(0, 0);
        total = total.add(c1);              // 계속적으로 total을 설정해줘야 한다
        total = total.add(c2);
        // 여기에 total의 resultReal과 resultImag를 출력하고 싶다
        System.out.printf("총 real = %.2f, 총 imag = %.2f", total.getReal(), total.getImag());
    }
}
