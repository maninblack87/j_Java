package Study;

class Point {
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

class Circle {
    private int radius = 0;
    private Point center;
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
    public void print(){
        System.out.printf("원 c는 좌표 (%d, %d)에 위치해 있고, 반지름은 %d이다\n", getCenter().getX(), getCenter().getY(), radius);
    }
}



public class CircleTest {
    public static void main(String[] args){
        Point p = new Point(25, 75);
        Circle c = new Circle(p, 10);
        c.print();
    }
}
