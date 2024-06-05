package Study.inheritance3;

// -Person 클래스
// 모든 구성원의 이름과 나이를 속성으로 가져야 합니다.
// 구성원의 정보를 출력하는 printInfo 메서드를 가져야 합니다.


public class Person {

    // 변수 선언
    private String name;
    private int    age;

    // 생성자
    public Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    // get함수
    protected String getName(){
        return name;
    }
    protected int    getAge(){
        return age;
    }

    // 인적 정보 표시
    protected void printInfo(){
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
    }
    
}
