package Factorial;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if (n == 0){
            return 1;       // 0! == 1 입니다!
        } else {
            return n * factorial(n - 1);
        }
    }
    private static int inputArgument(){
        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼이 될 숫자를 입력해주세요: ");
        return sc.nextInt();
    }
    public static void main(String[] args){
        int number = inputArgument();
        int result = factorial(number);
        System.out.printf("%d! = %d", number, result);
    }
}
