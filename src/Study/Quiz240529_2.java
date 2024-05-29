package Study;

import java.util.Scanner;

class Student {

    // 변수 선언
    private String name;
    private String studentID;
    private String department;

    // 생성자
    public Student(String nm, String id, String dpt){
        // 학생 정보 저장
        name = nm;
        studentID = id;
        department = dpt;
        // 학생 정보 출력
        print();
    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
    public String getDepartment(){
        return department;
    }
    private void print(){
        System.out.println("학생의 이름이 정상적으로 등록되었습니다.");
        System.out.printf("이름: %s\nID: %s\n부서: %s\n", getName(), getStudentID(), getDepartment());
    }
}

public class Quiz240529_2 {
    public static String iptName = "";
    public static String iptStudentID = "";
    public static String iptDepartment = "";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 원하는 만큼 학생을 등록할 수 있도록 반복문 사용
        System.out.println("################ 학생 정보 ################");
        do {
            System.out.print("학생을 등록하시겠습니까?(y/n)");
            if (scan.next().equals("y")){
                System.out.print("학생의 이름: ");
                iptName = scan.next();
                System.out.print("학생의 ID: ");
                iptStudentID = scan.next();
                System.out.print("학생의 부서: ");
                iptDepartment = scan.next();
                Student std = new Student(iptName, iptStudentID, iptDepartment);
            }
            else{
                System.out.print("학생 등록을 종료하겠습니다");
                break;
            }
        }while(true);
    }
}
