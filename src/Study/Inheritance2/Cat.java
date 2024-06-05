package Study.Inheritance2;

public class Cat extends Animal {

    // 변수 선언
    String color;   // 털 색깔

    // 생성자
    public Cat(String name, int age, int weight, String color){
        super(name, age, weight);       
        this.color = color;
    }

    // 고양이가 소리를 내는 행동을 반환하는 함수를 재정의
    @Override
    public String makesound(){
        return "Miaow";
    }

    // 고양이가 먹이를 먹는 행동을 반환하는 함수를 재정의
    @Override
    public String eat(){
        return "Cat is eating";
    }

    // 속성을 반환하는 get함수들
    public String getColor(){
        return color;
    }

}
