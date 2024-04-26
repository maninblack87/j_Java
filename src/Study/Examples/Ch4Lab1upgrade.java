package Study.Examples;

import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle implements Shape {
    double w, h;

    public Rectangle() {
        scan();
    }

    public Rectangle(int n, int m) {
        w = n;
        h = m;
    }

    @Override
    public double calculateArea() {
        return w * h;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (w + h);
    }

    public void print() {
        System.out.printf("사각형의 넓이: %.2f\n사각형의 둘레: %.2f\n", calculateArea(), calculatePerimeter());
    }

    private void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사각형의 너비를 입력해주세요: ");
        w = sc.nextDouble();
        System.out.print("사각형의 높이를 입력해주세요: ");
        h = sc.nextDouble();
    }
}

public class Ch4Lab1upgrade {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.print();
    }
}