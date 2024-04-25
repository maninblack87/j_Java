package Study;
class Parent{
    public Parent(){
        System.out.print("A");
    }
    public Parent(int a){
        System.out.print("B");
    }
    public void fn(){
        System.out.print("C");
    }
}
class Child extends Parent{
    public Child(){
        System.out.print("D");
    }
    public Child(int a){
        super(a);
        System.out.print("E");
    }
    public void fn(){
        System.out.print("F");
    }
}
public class OverridingB {
    public static void main(String[] args){
        Parent a = new Parent();
        Parent b = new Parent(1);
        Parent c = new Child();
        Parent d = new Child(1);
        Child e = new Child();
        Child f = new Child(2);
        a.fn();
        e.fn();
    }
}
