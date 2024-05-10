package Study;

import java.util.Scanner;

public class ArrayTest5 {
    // 상수 설정
    final static int STUDENTS = 5;
    public static void main(String[] args) {

        // scores 빈 배열 길이 설정
        int[] scores = new int[STUDENTS];

        // 해당 클래스에 내장된 함수들 실행
        getValues(scores);
        getAverage(scores);
    }

    // 메서드 //
    // 학생들의 점수를 입력하는 함수
    private static void getValues(int[] array){

        // Scanner 기능을 사용하기 위해 객체 생성
        Scanner scan = new Scanner(System.in);

        // 반복문으로 학생들의 성적을 입력한다
        for (int i = 0; i < array.length; i++){
            System.out.print("성적을 입력하시오:");
            array[i] = scan.nextInt();
        }
    }

    // 메서드 //
    // 학급의 평균을 구하는 함수
    private static void getAverage(int[] array){

        // 총점의 변수 초기화
        int total = 0;

        // 반복문으로 총점을 구한다
        for (int i = 0; i < array.length; i++)
            total += array[i];
            
        // 평균을 구하고나서, 결과물 출력
        System.out.println("평균 성적은 " + total / array.length + "입니다");
    }
}
