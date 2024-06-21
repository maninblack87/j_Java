package Study.Animal;

public class Animal implements AnimalInterface {
    private String name;
    private String type;
    
    public Animal(String name, String type){
        this.name = name;
        this.type = type;

        // 장점: 메인에서 구현하기 귀찮으면 생성자에서 호출하면 개꿀
        // 단점: 다형성을 해칠 수 있음
        // 결론: 일반적으로 이렇게 하지말자
        introduce();
        makesound();
        move();
        System.out.println();
    }

    // get함수
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

    public void makesound(){
        System.out.println(getType() + " " + getName() + "의 울음 소리");
    }

    public void move(){
        System.out.println(getType() + " " + getName() + "의 움직임");
    }

    public void introduce(){
        System.out.println("이름: " + getName() + "\n종류: " + getType());
    }
}
