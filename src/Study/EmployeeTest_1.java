package Study;
class Employee{
    private String name;
    private double salary;
    public static int count = 0;
    public Employee(String n, double s){
        name   = n;
        salary = s;
        count++;
    }
    protected void finalize(){
        count--;
    }
    public static int getCount(){
        return count;
    }
}
public class EmployeeTest_1 {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("김철수", 35000);
        e2 = new Employee("최수철", 50000);
        e3 = new Employee("김철호", 20000);
        int n = Employee.getCount();
        System.out.printf("현재 직원 수 = %d", n);
    }
}
