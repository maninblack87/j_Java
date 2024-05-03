package Study;
class Point{
    private int x, y;
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
    private String name;
    public Circle(String n, Point c, int r){
        name = n;
        center = c;
        radius = r;
    }
    public String getName(){
        return name;
    }
    public Point getCenter(){
        return center;
    }
    public int getRadius(){
        return radius;
    }
    public void printCircleInfo(){
        System.out.printf("원 %s의 중심 좌표(%d, %d), 반지름 %d\n", name, center.getX(), center.getY(), radius);
    }
}
public class CircleTest_3 {
    public static void main(String[] args) {
        Point p = new Point(15, 25);
        Circle c = new Circle("Cir01", p, 10);
        c.printCircleInfo();
    }
}
