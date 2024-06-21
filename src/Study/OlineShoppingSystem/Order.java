package Study.OlineShoppingSystem;

import java.util.ArrayList;
import Study.MartCartSystem.Product;            // 다른 패키지의 Product 클래스를 import함

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(int orderId, Customer customer, ArrayList<Product> products){
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    // get함수
    public int getOrderID(){
        return orderId;
    }
    public Customer getCustomer(){
        return customer;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    // 주문한 상품의 가격의 총합을 반환하는 함수
    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Product product : products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // 주문 결과 표시하는 함수
    public void displayOrder(){
        System.out.println("________________주문정보________________");
        System.out.println("주문 번호: " + getOrderID());
        System.out.println("주문자 ID: " + getCustomer().getCustomerId());
        System.out.println("주문 상품: ");
        for(Product product : getProducts()){
            System.out.println(product.toString());
        }
        System.out.println("총 구매가: " + calculateTotalPrice());
    }
}
