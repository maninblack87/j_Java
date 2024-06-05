package Study.inheritance3;

// -Student 클래스
// Person 클래스를 상속받아야 합니다.
// 추가적으로 학번(studentID)과 전공(major) 속성을 가져야 합니다.
// printInfo 메서드를 오버라이드하여 이름, 나이, 학번, 전공을 출력해야 합니다.


public class Student extends Person {
    
    // 변수 선언
    private String studentId;
    private String major;

    // 생성자
    public Student(String name, int age, String studentId, String major){
        super(name, age);
        this.studentId = studentId;
        this.major     = major;
    }

    // get함수
    protected String getStudentId(){
        return studentId;
    }
    protected String getMajor(){
        return major;
    }

    // 인적 정보 출력
    @Override
    protected void printInfo(){
        System.out.println("############ 학생 정보 ############");
        System.out.println("학생ID: " + studentId);
        super.printInfo();
        System.out.println("전공: " + major);
    }

}
