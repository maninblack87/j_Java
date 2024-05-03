package Study;

class Person{
    private String firstName;
    private String lastName;
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;                             // this는 현재 객체를 가리킨다
        this.lastName  = lastName;                              // 이하 생략.............
    }
    public String buildName(){
        return String.format("%s %s\n", firstName, lastName);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("전", "석환");
        String myName = p.buildName();
        System.out.printf("내 이름은 %s", myName);
    }
}
