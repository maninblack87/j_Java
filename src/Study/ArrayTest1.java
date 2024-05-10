package Study;
import java.util.Scanner;
public class ArrayTest1 {
    public static void main(String[] args) {
        final int STUDENTS = 5;                     // 이하 변수 초기화
        int total = 0;
        Scanner scan = new Scanner(System.in);      // Scanner 객체를 생성한다
        int[] scores = new int[STUDENTS];           // 배열 변수 생성 (길이 = STUDENTS)
        for (int i = 0; i < STUDENTS; i++){
            System.out.print("성적을 입력하시오:");
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < STUDENTS; i++)
            total += scores[i];
        System.out.println("평균 성적은" + total / STUDENTS + "입니다.");
    }
}
