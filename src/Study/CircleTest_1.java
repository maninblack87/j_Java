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
    private String name;
    private Point center;
    private int radius;
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
}

public class CircleTest_1 {
    public static void main(String[] args) {
        Point p = new Point(25, 75);
        Circle c = new Circle("Sphere No.0101", p, 10);
        System.out.printf("원 %s의 좌표 (%d, %d)\n원 %s의 반지름 %d", c.getName(), c.getCenter().getX(), c.getCenter().getY(), c.getName(), c.getRadius());
    }
}
