package Study.Inheritance2;

public class Bear extends Animal {
    
    // 변수 선언
    String color;   // 털 색깔

    // 생성자
    public Bear(String name, int age, int weight, String color){
        super(name, age, weight); 
        this.color = color;
    }

    // 곰이 소리를 내는 행동을 반환하는 함수를 재정의
    @Override
    public String makesound(){
        return "Shi";
    }

    // 곰이 먹이를 먹는 행동을 반환하는 함수를 재정의
    @Override
    public String eat(){
        return "Bear is eating";
    }

    // 속성을 반환하는 get함수들
    public String getColor(){
        return color;
    }

}
