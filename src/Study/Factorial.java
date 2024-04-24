package Study;

import java.util.Scanner;

class GoFactorial{
    public static int goFactorial(int n){
        return n * goFactorial(n-1);
    }
}

public class Factorial {
    public static void main(String[] args){
        int result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 수행할 인자가 될 숫자를 입력해주세요: ");
        int fact = sc.nextInt();
        for (int i = fact; i >  0; i--){
            System.out.printf("%d x %d = %d\n", result, i, result * i);
            result *= i;
        }
        System.out.printf("팩토리얼 %d의 수행 결과 = %d", fact, result);
    }
}
