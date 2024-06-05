package Study.Inheritance2;

public class Animal {

    // 변수 선언
    private String name;
    private int age;
    private int weight;

    // 생성자
    public Animal(String name, int age, int weight){
        this.name = name;
        this.age  = age;
        this.weight = weight;
    }
    
    // 동물의 소리를 내는 행동을 반환하는 함수
    public String makesound(){
        return "Animal's sound";
    }


    // 먹이를 먹는 행동을 반환하는 함수
    public String eat(){
        return "Animal is eating";
    }

    // 동물의 정보를 표시
    public void displayInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("무게: " + weight);
        System.out.println();
    }

    // 속성을 반환하는 get함수들
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int weight(){
        return weight;
    }

}
