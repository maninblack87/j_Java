package Study;

import java.util.Scanner;
import java.util.ArrayList;

public class QuizMovieRating {

    // 변수 선언 및 초기화
    ArrayList<Integer> rates = new ArrayList<>();
    private int rate;
    private int total = 0;
    private double avg;

    // 생성자
    public QuizMovieRating(){
        rateMovie();
        calculateAvg();
    }

    // 원하는 만큼 평점을 입력할 수 있는 함수
    private void rateMovie(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("평점을 입력해주세요(1~5점, 0을 입력하면 종료): ");
            rate = sc.nextInt();
            if(rate == 0){
                break;
            } else if((rate > 0) && (rate <= 5)) {
                rates.add(rate);
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    // 평점의 평균을 구하는 함수
    private void calculateAvg(){

        // 일단 총점을 구한다
        for (int i = 0; i < rates.size(); i++){
            total += rates.get(i);
        }

        // 평균을 구한다 (총점을 가지고)
        avg = (double) total / rates.size();

    }

    // 결과를 출력: 평점의 평균
    public void printAvg(double avg){
        System.out.printf("해당 영화의 평점은 평균 %.2f점 입니다.", avg);
    }

    public static void main(String[] args){
        QuizMovieRating quiz = new QuizMovieRating();
        quiz.printAvg(quiz.avg);
    }
}