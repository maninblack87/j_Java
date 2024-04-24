package Study;
class A {
    public void fn(){
        System.out.println("A");
    }
}
class B extends A {
    public void fn(){
        System.out.println("B");
    }
}
public class Overriding {
    public static void main(String[] args){
        A a = new B();
        a.fn();
    }
}
