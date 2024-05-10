package Study;
import java.util.Scanner;
public class ArrayTest1_1 {
    public static void main(String[] args) {
        // 상수 정의
        final int STUDENTS = 5;
        // 변수 초기화
        int total = 0;
        double average;
        // (빈) 배열 변수 생성
        int[] scores = new int[STUDENTS];
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        // 반복문 실행
        // 점수를 입력시킨다
        // 반복문이 끝나면, 총점이 완성된다.
        for (int i = 0; i < STUDENTS; i++){
            System.out.printf("%d번 학생의 점수를 입력해주세요: ", i+1);
            scores[i] = scan.nextInt();
            total += scores[i];
        }
        // 평균을 구한다, 총점을 가지고
        average = total / STUDENTS;
        // 결과를 출력한다
        // 총점
        System.out.printf("총점 : %d", total);
        // 평균
        System.out.printf("평균 : %.2f", average);
    }
}
