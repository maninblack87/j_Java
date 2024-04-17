package Study;

import java.util.*;

class GradeCalculator {
    private int ptKorean;
    private int ptEnglish;
    private int ptMath;
    private void setPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적 입력 : ");
        ptKorean = sc.nextInt();
        System.out.print("영어 성적 입력 : ");
        ptEnglish = sc.nextInt();
        System.out.print("수학 성적 입력 : ");
        ptMath = sc.nextInt();
        sc.close();
    }
    private int getTotal(){
        return ptKorean + ptEnglish + ptMath;
    }
    private double getMedian(){
        return (double) getTotal() / 3;
    }
    private void printDetail(){
        System.out.println("************* 결과 산출 *************");
        System.out.printf("국어 점수 = %d\n영어 점수 = %d\n수학 점수 = %d\n", ptKorean, ptEnglish, ptMath);
        System.out.printf("총점 = %d, 평균 = %.2f", getTotal(), (double) getMedian());
    }
    public void CalculateManager(){
        setPoints();
        printDetail();
    }
}

public class quiz240417 {
    public static void main(String[] args) {
        GradeCalculator c = new GradeCalculator();
        c.CalculateManager();
    }
}
