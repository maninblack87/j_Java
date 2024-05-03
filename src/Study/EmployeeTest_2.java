package Study;

class Employee{
    // 변수 선언 및 초기화
    private String name;
    private int salary;
    public static int count = 0;
    // 생성자 직원 등록 및 직원수 카운팅
    public Employee(String n, int s){
        name   = n;
        salary = s;
        count++;
    }
    // 직원이 소멸할 때 호출된다
    protected void finalize(){
        count--;
    }
    // 반환 직원 수
    static public int getCount(){
        return count;
    }
}

public class EmployeeTest_2 {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("김철수", 35000);
        e2 = new Employee("최수철", 50000);
        e3 = new Employee("김철호", 20000);
        int n = Employee.getCount();
        System.out.printf("직원 수 = %d", n);
    }
}
