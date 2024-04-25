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
public class Overriding3 {
    public static void main(String[] args){
        // Parent a = new Parent();    // A
        // Parent b = new Parent(1);   // B
        // b.fn();                      // C
        Parent d = new Child();         // D
        // Parent e = new Child(1);    // E
        // d.fn();                       // F
    }
}
