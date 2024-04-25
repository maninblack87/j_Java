package Study;
class Parent{
    public Parent(){
        System.out.println("A");
    }
    public Parent(int a){
        System.out.println("B");
    }
    public void fn(){
        System.out.println("C");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("D");
    }
    public Child(int a){
        System.out.println("E");
    }
    public void fn(){
        System.out.println("F");
    }
}
public class OverridingB2 {
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Parent(1);
        Parent c = new Child();
        Parent d = new Child(1);
        Child e = new Child();
        Child f = new Child(1);
        a.fn();
        e.fn();
    }
}
