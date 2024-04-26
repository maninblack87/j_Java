package Study;

import java.util.Scanner;

public class Gcd2 {
    public static void main(String[] args) {
        // 두개의 정수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        // 최대 공약수 계산
        int gcd = calculateGCD(num1, num2);

        // 결과 출력
        System.out.println("두 수의 최대공약수는 " + gcd + "입니다.");
        sc.close();
    }

    public static int calculateGCD(int a, int b){
        if (b == 0){
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
