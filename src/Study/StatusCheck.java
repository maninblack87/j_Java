package Study;

import java.util.Scanner;

public class StatusCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String status;

        System.out.print("지금 컨디션을 입력해주세요: ");
        status = sc.next();

        if (status.equals("좋음")){
            System.out.println("너 컨디션 좋구나");
        } else if (status.equals("나쁨")){
            System.out.println("너 컨디션 안 좋구나");
        } else if (status.equals("보통")){
            System.out.println("너 컨디션 그저그럼");
        } else {
            System.out.println("걍 너 알아서 해라ㅡㅡ");
        }

        sc.close();

    }
    
}
