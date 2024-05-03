package Study;

class MyOddNumbers {
    int result = 0;
    public MyOddNumbers(int n){
         calculate(n);
         print(n);
    }
    private void calculate(int x){
        for (int i = 1; i <= x; i += 2){
            result += i;
        }
    }
    private void print(int x){
        System.out.printf("1부터 %d까지 홀수의 합 : %d", x, result);
    }
}
public class OddNumbers2 {
    public static void main(String[] args) {
        MyOddNumbers n = new MyOddNumbers(10);
    }
}