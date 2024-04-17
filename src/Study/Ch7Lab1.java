package Study;

class BankAccount {
    int balance = 0;
    void deposit(int amount){
        balance += amount;
    }
    void draw(int amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("계좌 잔액이 부족합니다.");
        }
    }
    int getBalance(){
        return balance;
    }
    int addInterest(){
        return balance + (int) (balance * 0.075);
    }
}

public class Ch7Lab1 {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.balance = 100;
        b.draw(60);
        System.out.println("당신의 계좌 잔액은 " + b.getBalance() + "원 입니다.");
        System.out.println("당신의 이자를 반영한 계좌 잔액은 " + b.addInterest() + "원 입니다.");
    }
}
