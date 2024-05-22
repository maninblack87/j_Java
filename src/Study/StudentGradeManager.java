package Study;

import java.util.Scanner;

public class StudentGradeManager {

    public StudentGradeManager() throws Exception{

        

    }

    class Student {

        // 변수 선언 및 초기화
        private String name;
        private int korean;
        private int english;
        private int mathematics;

        public Student() throws Exception{

            // Scanner 객체 생성
            Scanner scan = new Scanner(System.in);

            // 학생 이름 및 주요 과목 점수 설정
            setName(scan);
            setKorean(scan, this.name);
            setEnglish(scan, this.name);
            setMathematics(scan, this.name);

        }

        // set 함수 그룹
        private void setName(Scanner scan) throws Exception{
            System.out.print("학생의 이름을 입력해주세요: ");
            this.name = scan.next();
        }
        private void setKorean(Scanner scan, String name) throws Exception{
            System.out.print(name + "학생의 국어 점수를 입력해주세요: ");
            this.korean = scan.nextInt();
        }
        private void setEnglish(Scanner scan, String name) throws Exception{
            System.out.print(name + "학생의 영어 점수를 입력해주세요: ");
            this.english = scan.nextInt();
        }
        private void setMathematics(Scanner scan, String name) throws Exception{
            System.out.print(name + "학생의 수학 점수를 입력해주세요: ");
            this.mathematics = scan.nextInt();
        }

        // get 함수 그룹
        private String getName() throws Exception{
            return this.name;
        }
        private int getKorean() throws Exception{
            return this.korean;
        }
        private int getEnglish() throws Exception{
            return this.english;
        }
        private int getMathematics() throws Exception{
            return this.mathematics;
        }

    }

    public static void main(String[] args){

    }
}
