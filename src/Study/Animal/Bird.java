package Study.Animal;

public class Bird extends Animal {
    
    public Bird(String name, String type){
        super(name, type);
    }

    @Override
    public void makesound(){
        System.out.println(getType() + " " + getName() + "의 울음 소리 : 피~존~!");
    }

    @Override
    public void move(){
        System.out.println(getType() + " " + getName() + "의 움직임: 날아서 몸통 박치기");
    }

    @Override
    public void introduce(){
        super.introduce();
    }

}
