package Study;

class Animal{
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Dog extends Animal{
    private String name;
    private int age;
    public String sound;
    public Dog(String name, int age){
        // 부모 클래스의 생성자 호출
        super(name, age);
        this.sound = "멍멍!";
    }
    public void MakeSound(){
        System.out.println(this.sound);
    }
}

class Cat extends Animal{
    private String name;
    private int age;
    public String sound;
    public Cat(String name, int age){
        // 부모 클래스의 생성자 호출
        super(name, age);
        this.sound = "야옹";
    }
    public void MakeSound(){
        System.out.println(this.sound);
    }
}

public class QuizInheritance {
    public static void main(String[] args) {
        Dog white = new Dog("흰둥이", 1);
        Cat alexander = new Cat("알렉산더", 1);
        System.out.printf("강아지 %s의 나이는 %d살이며 \"%s\"소리를 냅니다.\n", white.getName(), white.getAge(), white.sound);
        System.out.printf("고양이 %s의 나이는 %d살이며 \"%s\"소리를 냅니다.\n", alexander.getName(), alexander.getAge(), alexander.sound);
    }
}
