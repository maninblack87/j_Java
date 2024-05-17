package Study.Examples;

class MyOddNumbers {
    int result = 0;
    int number;

    public MyOddNumbers(int n) {
        number = n;
        calculate();
    }

    private void calculate() {
        for (int i = 1; i <= number; i += 2) { // 2씩 증가하여 홀수만 계산
            result += i;
        }
    }

    public void print() {
        System.out.printf("1부터 %d까지의 홀수의 합은: %d\n", number, result);
    }
}
public class OddNumbersOptimization {
    public static void main(String[] args) {
        System.out.println("\n<< 제목 >>  1부터 10까지의 홀수\n");
        MyOddNumbers n = new MyOddNumbers(10);
        n.print();
    }
}