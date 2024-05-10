package Study;
import java.util.Scanner;

class ScoreCalculator{
    
    // 변수 선언 및 초기화
    private int students;
    int[] scores;                               // 필요할 때 각 학생들의 점수를 탐색할 수 있게 
    private int total = 0;
    private double average;

    // 생성자
    public ScoreCalculator(int stdNum){
        students = stdNum;                      // 학생 수를 초기화
        scores = new int[stdNum];               // scores 배열의 길이를 초기화
        setScores();
    }

    // 학생들의 점수를 구한다
    private void setScores(){
        Scanner scan = new Scanner(System.in);  // Scanner 사용을 위해 scan 객체를 생성
        for (int i = 0; i < students; i++){
            System.out.printf("학생 %d의 점수를 입력하세요: ", i+1);
            scores[i] = scan.nextInt();
        }
        scan.close();                           // scan 종료
    }

    // 총점을 구한다
    public int setTotal(){
        for (int i = 0; i < students; i++){
            total += scores[i];
        }
        return total;
    }

    // 평균을 구한다
    public double setAverage(){
        average = total / students;
        return average;
    }

}
public class ArrayTest1_2 {
    final static int STUDENTS = 5;
    public static void main(String[] args) {
        ScoreCalculator s = new ScoreCalculator(STUDENTS);
        System.out.printf("총점 = %d\n", s.setTotal());
        System.out.printf("평균 = %.2f\n", s.setAverage());
    }
}
