package Study.Animal;

public class Dog extends Animal{
    
    public Dog(String name, String type){
        super(name, type);
    }

    @Override
    public void makesound(){
        System.out.println(getType() + " " + getName() + "의 울음 소리 : 멍멍!");
    }

    @Override
    public void move(){
        System.out.println(getType() + " " + getName() + "의 움직임: 몸통 박치기");
    }

    @Override
    public void introduce(){
        super.introduce();
    }

}
