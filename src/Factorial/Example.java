package Factorial;

public class Example {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // 팩토리얼을 계산할 숫자
        int result = factorial(number);
        System.out.println(number + "! = " + result);
    }
}