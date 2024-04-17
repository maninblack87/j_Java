package Study;

import java.util.*;

public class quiz240417_2 {

    public static void main(String[] args) {
        int weekday;

        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 7까지의 숫자를 입력해주세요: ");
        weekday = sc.nextInt();

        switch (weekday) {
            case 1: 
                System.out.println("월요일이다.");
                break;
            case 2: 
                System.out.println("화요일이다.");
                break;
            case 3: 
                System.out.println("수요일이다.");
                break;
            case 4: 
                System.out.println("목요일이다.");
                break;
            case 5: 
                System.out.println("금요일이다.");
                break;
            case 6: 
                System.out.println("토요일이다.");
                break;
            case 7: 
                System.out.println("일요일이다.");
                break;
        }
    }
    
}
