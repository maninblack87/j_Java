package Study;

class MyOddNumbers {
    int result = 0;
    int number;
    public MyOddNumbers(int n){
        number = n;
        calculate();
        print();
    }
    private int calculate(){
        for (int i = 1; i <= number; i++){
            if (i % 2 == 1){
                result += i;
                System.out.printf("현재 %4d를 더해서 result = %4d\n", i, result);
            }
        }
        return result;
    };
    private void print(){
        System.out.printf("1부터 %d까지의 홀수는 : %d\n", number, result);
    }
}
public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("\n<< 제목 >>  1부터 10까지의 홀수\n");
        MyOddNumbers n = new MyOddNumbers(10);
    }
}
