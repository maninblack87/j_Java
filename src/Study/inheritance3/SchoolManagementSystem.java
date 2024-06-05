package Study.inheritance3;

import java.util.ArrayList;

public class SchoolManagementSystem {

    // 학교 선생님 및 학생들의 객체를 담을 배열 생성
    ArrayList<Person> people;

    // 생성자
    public SchoolManagementSystem(){
        people = new ArrayList<>();
    }

    // 선생님 혹은 학생을 추가
    public void addPerson(Person person){
        people.add(person);
    }

    // 선생님 혹은 학생을 제거
    public void removePerson(Person person){
        people.remove(person);
    }

    // 선생님 혹은 학생의 정보를 표시
    public void printAllInfo(){
        for (Person p : people){
            p.printInfo();
        }
    }


    public static void main(String[] args) {
        
        // 학교 관리 시스템 생성
        SchoolManagementSystem schsys = new SchoolManagementSystem();

        // 선생님 및 학생 객체 생성
        Teacher teacher1 = new Teacher("나지수", 24, "IT융합");
        Student student1 = new Student("전석환", 37, "ITC0001", "IT융합");
        Teacher teacher2 = new Teacher("이영옥", 40, "자바");

        // 선생님 및 학생 리스트를 학교 관리 시스템에 추가
        schsys.addPerson(teacher1);
        schsys.addPerson(student1);
        schsys.addPerson(teacher2);

        // 선생님 및 학생 리스트 표시
        schsys.printAllInfo();

        // 선생님 및 학생 리스트를 학교 관리 시스템에서 삭제
        System.out.printf("\n%s를 삭제됩니다.", teacher2.getName());
        schsys.removePerson(teacher2);
        System.out.println("\n인적 리스트가 정상적으로 삭제되었습니다.\n");

        // 다시 선생님 및 학생 리스트 표시
        schsys.printAllInfo();

    }
    
}
