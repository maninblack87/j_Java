package Study._MyComponents;

import java.util.Random;

public class RandomGenerator {

    Random random;

    public RandomGenerator(){
        random = new Random();
    }

    // 매개변수만큼 정수의 랜던 넘버가 생성되어 반환된다
    public int randNumGenerate(int num){
        return random.nextInt(num);
    }
    
}
