package Study;

import java.util.*;

class Employee {
    // 속성 선언
    // 직원의 이름과 급여, 직원 수
    private String name;
    private double salary;
    private static int count = 0;   // 정적변수
    // 생성자
    // 속성 초기화
    // -> 객체를 생성하면 직원 이름과 급여가 설정되고, 직원수가 +1 카운트 된다
    public Employee(String n, double s){
        name = n;
        salary = s;
        count++;
    }
    // 직원 수를 반환
    public static int getCount(){
        return count;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("김철수", 35000);     // e1 이름으로 객체 생성 -> 생성자 실행
        e2 = new Employee("최수철", 50000);     // e2 이름으로 객체 생성 -> 생성자 실행
        e3 = new Employee("김철호", 20000);     // e3 이름으로 객체 생성 -> 생성자 실행
        int n = Employee.getCount();               // n 변수를 선언해서, 거기에 Employee클래스에서 getCount()함수
        System.out.println("현재의 직원 수="+n);
    }
}
