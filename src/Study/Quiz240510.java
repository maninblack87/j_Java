package Study;

import java.util.Scanner;

class Calculator{
    int num1, num2, result;
    String operation;
    public Calculator(int n, int m, String op){
        num1 = n;
        num2 = m;
        operation = op;
        defineOperation(operation);
        printResult();

    }
    public void defineOperation(String op){
        if (op.equals("+"))
            add();
        else if (op.equals("-"))
            sub();
        else if (op.equals("*"))
            multiple();
        else if (op.equals("/"))
            divide();
        else
            System.out.println("잘못된 연산자 입력입니다.");
    }
    private void add(){
        result = num1 + num2;
    }
    private void sub(){
        result = num1 - num2;
    }
    private void multiple(){
        result = num1 * num2;
    }
    private void divide(){
        result = (int) num1 / num2;                           // 결과 값은 정수로 반환시킨다.
    }

    private void printResult(){
        System.out.printf("출력 : %d %s %d = %d", num1, operation, num2, result);
    }
    
}

public class Quiz240510 {
    public static void main(String[] args) {
        int num1, num2;
        String operation;

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        num1 = sc.nextInt();
        System.out.print("연산 방법을 입력해주세요(+,-,*,/ 중 택1): ");
        operation = sc.next();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        num2 = sc.nextInt();
        sc.close();

        Calculator c = new Calculator(num1, num2, operation);
    }
}
