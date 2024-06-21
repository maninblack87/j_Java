package Study.MartCartSystem;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> items;
    protected double totalPrice = 0;

    public Cart(){
        items = new ArrayList<>();
    }

    //get함수
    public double getTotalPrice(){
        return totalPrice;
    }

    // 제품을 바구니에 추가
    public void addItem(Product product){
        items.add(product);
    }

    // 제품을 바구니에서 삭제
    public void removeItem(String productId){
        for (Product item : items){
            if(item.getProductId().equals(productId)){
                items.remove(item);
                System.out.println("삭제가 완료되었습니다: " + item.getProductId() + " " + item.getProductName());
                break;
            }
        }
    }

    // 바구니에 담긴 모든 제품의 가격의 합계를 계산하여 반환
    public double calculateTotalPrice(){
        for (Product item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void displayCart(){
        for (Product item : items){
            System.out.println(item.toString());
        }
    }
}
