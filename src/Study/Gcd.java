package Study;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        int x, y, r;
        System.out.print("두개의 정수를 입력하시오(큰 수, 작은 수): ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        while (y != 0){
            r = x % y;      // 'x % y' 계산을 통해 x를 y로 나눈 나머지를 r에 저장
            x = y;          // x의 값을 y로 업데이트
            y = r;          // y의 값을 r로 업데이트
        }
        System.out.printf("최대 공약수는 %d", x);
    }
}
