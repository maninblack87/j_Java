package Study.MartCartSystem;

public class Payment {
    public Payment(double amount){
        if(amount > 0){
            System.out.println("결제를 완료했습니다: " + amount + "원");
        }else{
            System.out.println("결제할 품목이 없습니다");
        }
    }
}
