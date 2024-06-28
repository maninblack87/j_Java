package Study.OrderProcessingSystem;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products;
    private double totalAmount = 0;

    public Order(int orderId){
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    private void calculTotalAmount(){
        for (Product product : products){
            totalAmount += product.getPrice();
        }
    }

    // get함수
    public double getTotalAmount(){
        return totalAmount;
    }

    public void printOrderDetails(){
        System.out.println("-----------------< 주문 내역 >-------------------");
        for (Product product : products){
            System.out.print("상품명: " + product.getProductName() + "        ");
            System.out.print("가격: " + product.getPrice()  + "\n");
        }
        calculTotalAmount();        // 주문 총액을 출력하려면 해당 함수 호출이 필수이다
        System.out.println("총 주문가격:" + getTotalAmount());
        System.out.println("------------------------------------------------");
        
    }

}
