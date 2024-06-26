package Study.VehicleManagementSystem;

import java.util.Random;

public class NumberGenerator {
    String randNum;
    Random rand = new Random();

    public String GenerateNumber(){
        randNum = "";
        // 4번 동안 랜덤 숫자를 생성
        for (int i = 0; i < 4; i++){
            randNum += String.valueOf(rand.nextInt(10));
        }
        return randNum;
    }
}
