package Study;

class Test2 {
    public void sub(int... v){
        System.out.println("인수의 개수: " + v.length);
        if (v.length == 0){
            System.out.print("null~");
        } else {
            for (int x : v){
                System.out.print(x);
            }
        }
        System.out.println();
    }
}

public class VariableLengthArgsTest2 {
    public static void main(String[] args){
        Test2 t = new Test2();
        t.sub(1);
        t.sub(1,2,3,4,5);
        t.sub();
    }
}
