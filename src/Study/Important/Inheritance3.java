// 이것은 다.형.성에 대한 개념을 활용한 것이다

// 클래스 B는 A의 자식 클래스이다
// 부모 클래스는 자식 클래스의 함수를 

package Study.Important;
class A {
    public void fnA(){
        System.out.println("A");
    }
}
class B extends A {
    public void fnB(){
        System.out.println("B");
    }
}
public class Inheritance3 {
    public static void main(String[] args){
        // 자식 클래스로 객체를 생성했을 때, 부모 클래스의 함수도 호출 가능
        B a = new B();
        a.fnA();
        a.fnB();
        // 위의 a와 같이 B클래스의 인스턴스이지만 A클래스의 함수만 접근 가능하다
        A b = new B();
        b.fnA();
        // b.fnB();         <-- 해당 함수 호출은 사용이 불가능하다!
        // B c = new A();   <-- 이런 식으로 인스턴스 생성은 불가능하다!
    }
}
