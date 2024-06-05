package Study.inheritance3;

// -Teacher 클래스
// Person 클래스를 상속받아야 합니다.
// 추가적으로 과목(subject) 속성을 가져야 합니다.
// printInfo 메서드를 오버라이드하여 이름, 나이, 과목을 출력해야 합니다.
// teach 메서드를 추가하여 "Teaching [subject]" 메시지를 출력해야 합니다.


public class Teacher extends Person {
    
    // 변수 선언
    private String subject;

    // 생성자
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    // get함수
    protected String subject(){
        return subject;
    }

    // 인적 정보 출력
    public void printInfo(){
        System.out.println("############ 교사 정보 ############");
        super.printInfo();
        System.out.println("전공: " + subject);
    }

}
