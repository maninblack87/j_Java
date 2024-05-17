package Study;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요: ");
        String nowSeason = sc.next();
        switch (nowSeason){
            case "봄":
                System.out.println("꽃 구경 나가라");
                break;
            case "여름":
                System.out.println("바다나 가라");
                break;
            case "가을":
                System.out.println("단풍이나 봐라");
                break;
            case "겨울":
                System.out.println("눈 구경 가라");
                break;
            default:
                System.out.println("계절 입력한거 맞냐");
                break;
        }
        sc.close();
    }
}
