package Study.Inheritance2;

public class Dog extends Animal {
    
    // 변수 선언
    String breed;   // 품종

    // 생성자
    public Dog(String name, int age, int weight, String breed){
        super(name, age, weight);       // 개의 소리를 설정한다
        this.breed = breed;
    }

    // 개가 소리를 내는 행동을 출력하는 함수를 재정의
    @Override
    public String makesound(){
        return "Warl";
    }

    // 개가 먹이를 먹는 행동을 출력하는 함수를 재정의
    @Override
    public String eat(){
        return "Animal is eating";
    }

    // 속성을 반환하는 get함수들
    public String getBreed(){
        return breed;
    }

}
