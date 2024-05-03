package Study;

class Point{
    private int x;
    private int y;
    public Point(int a, int b){
        x = a;
        y = b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class Circle{
    private Point center;
    private int radius;
    public Circle(Point c, int r){
        center = c;
        radius = r;
    }
    public Point getCenter(){
        return center;
    }
    public int getRadius(){
        return radius;
    }
}
class Circle2{
    private Point center;
    private int radius;
    public Circle2(Point c, int r){
        center = c;
        radius = r;
    }
    public Point getCenter(){
        return center;
    }
    // public int getRadius(){
    //     return radius;
    // }   이거는 필요 없다!
    public void print(){
        System.out.printf("원의 중심 좌표는 (%d, %d)이고, 반지름은 %d입니다\n", center.getX(), center.getY(), radius);
    }
}

public class CircleTest_2 {
    public static void main(String[] args){
        Point p = new Point(25, 50);
        Circle2 c = new Circle2(p, 10);
        c.print();
    }
}
