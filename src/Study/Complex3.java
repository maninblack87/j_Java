package Study;

public class Complex3 {

    // 변수 선언
    double real;
    double imag;

    // 생성자
    public Complex3(double r, double i){
        real = r;
        imag = i;
    }

    // get함수들
    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }

    // 해당 객체에 같은 클래스의 다른 객체의 Real값과 Imag값을 더한다
    public Complex3 add(Complex3 c){
        double resultReal = real + c.getReal();
        double resultImag = imag + c.getImag();
        return new Complex3(resultReal, resultImag);
    }

    public static void main(String[] args){

        // 객체를 생성한다
        Complex3 c1 = new Complex3(10, 20);
        Complex3 c2 = new Complex3(5, 15);

        // 객체 c1에 c2의 속성들의 값을 더한다(add()함수를 호출해서)
        Complex3 t = c1.add(c2);

        // 결과 출력
        System.out.printf("Real is %.2f, Imag is %.2f", t.getReal(), t.getImag());

    }
}
