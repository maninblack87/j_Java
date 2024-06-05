package Study.Inheritance2;

public class Bird extends Animal {
    
    // 변수 선언
    int wingLength;      // 날개의 길이

    // 생성자
    public Bird(String name, int age, int weight, int wingLength){
        super(name, age, weight);       
        this.wingLength = wingLength;
    }

    // 새가 소리를 내는 행동을 반환하는 함수를 재정의
    @Override
    public String makesound(){
        return "Chirp";
    }

    // 새가 먹이를 먹는 행동을 반환하는 함수를 재정의
    @Override
    public String eat(){
        return "Bird is eating";
    }

    // 속성을 반환하는 get함수들
    public int getWingLength(){
        return wingLength;
    }

}
