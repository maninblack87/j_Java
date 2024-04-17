package Study;

import java.util.*;

class DiceGame2{
    private int userGuess;
    private int diceFace;
    private void rollDice(){
        diceFace = (int) (Math.random() * 6) + 1;
    }
    private void getUserNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        userGuess = sc.nextInt();
    }
    private void checkUserGuess(){
        if (userGuess == diceFace){
            System.out.println("맞췄습니다!");
        } else {
            System.out.println("틀렸습니다.");
        }
    }
    
    public void startPlaying(){
        rollDice();
        getUserNumber("1~6사의 자연수를 입력하십시오: ");
        checkUserGuess();
    }
}

public class DiceGameTest2 {
    public static void main(String[] args) {
        DiceGame2 game = new DiceGame2();
        game.startPlaying();
    }
}
