package Study;

import java.util.Scanner;
import java.util.ArrayList;

public class quiz240412_1 {
    // 정수 n을 입력해서 1부터 n까지의 소수를 구하는 프로그램
    // (!) 소수는 1과 자기 자신으로만 나누어 떨어지는 수
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n을 입력하세요: ");
        int n = sc.nextInt();

        System.out.println("1부터 " + n + "까지의 소수");

        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();

    }

    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
