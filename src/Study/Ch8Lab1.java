package Study;

class Box {
    // 필드 정의
    int width;
    int length;
    int height;
    // 메소드 정의
    private void setWidth(int w){
        width = w;
    }
    private void setLength(int l){
        length = l;
    }
    private void setHeight(int h){
        height = h;
    }
    private int getWidth(){
        return width;
    }
    private int getLength(){
        return length;
    }
    private int getHeight(){
        return height;
    }
    // 부피를 구하는 함수
    private int getVolumn(){
        return width * length * height;
    }
    // 현재 상자의 속성 값을 문자열로 출력하는 함수
    private void print(){
        System.out.printf("width = %d, length = %d, height = %d\n", width, length, height);
        System.out.printf("volumn = %d\n", getVolumn());
    }

    public void boxManager(int w, int l, int h){
        setWidth(w);
        setLength(l);
        setHeight(h);
        print();
    }
}

public class Ch8Lab1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.boxManager(100, 100, 100);

        Box box2 = new Box();
        box2.boxManager(200, 200, 200);
    }
}
