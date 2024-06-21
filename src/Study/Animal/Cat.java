package Study.Animal;

public class Cat extends Animal {
    
    public Cat(String name, String type){
        super(name, type);
    }
    @Override
    public void makesound(){
        System.out.println(getType() + " " + getName() + "의 울음 소리 : 야옹");
    }

    @Override
    public void move(){
        System.out.println(getType() + " " + getName() + "의 움직임 : 집사가 몸통 박치기");
    }

    @Override
    public void introduce(){
        super.introduce();
    }
}
