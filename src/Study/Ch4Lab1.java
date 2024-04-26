package Study;

import java.util.Scanner;

class Rectangle {
    double w, h, area, perimeter;
    public Rectangle(){
        scan();
        area      = w*h;            // 넓이
        perimeter = 2*(w+h);        // 둘레
    }
    public Rectangle(int n, int m){
        w = n;
        h = m;
        area      = n*m;            // 넓이
        perimeter = 2*(n+m);        // 둘레
    }
    public void print(){
        System.out.printf("사각형의 넓이: %.2f\n사각형의 둘레: %.2f\n", area, perimeter);
    }
    private void scan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("사각형의 너비를 입력해주세요: ");
        w = sc.nextDouble();
        System.out.print("사각형의 높이를 입력해주세요: ");
        h = sc.nextDouble();
    }
}

public class Ch4Lab1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.print();
    }
}
