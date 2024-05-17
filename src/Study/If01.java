package Study;

import java.util.Scanner;

class MyPlan{
    private String answer;
    public MyPlan(){
        getAnswer();
        goPlan();
    }
    private void getAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("오늘은 무슨 요일입니까? ");
        answer = sc.nextLine();
        System.out.println("answer = " + answer);
        sc.close();
    }
    private void goTravel(String subject){
        System.out.printf("가자 %s로!", subject);
    }
    private void goRead(String subject){
        System.out.printf("읽자 %s를(을)!", subject);
    }
    private void goPlan(){
        if (answer.equalsIgnoreCase("Sat")){
            goTravel("파크");
        }
        else {
            goRead("책");
        }
    }
}

public class If01 {
    public static void main(String[] args) {
        MyPlan plan1 = new MyPlan();
    }
}
