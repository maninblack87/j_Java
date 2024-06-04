package Study.Important;

public class Game369 {
    public static void main(String[] args){
        for (int i = 1; i <= 50; i++){
            int count = 0;
            int number = i;

            // 각 자리 숫자 검사
            while(number > 0){
                int digit = number % 10;
                if(digit == 3 || digit == 6 || digit == 9){
                    count++;
                }
                number /= 10;
            }

            // 출력
            if (count > 0){
                System.out.print(i + "번째: ");
                for (int j = 0; j < count; j++){
                    System.out.print("짝");
                }
                System.out.println();
            }else{
                System.out.println(i);
            }
        }
    }
}
