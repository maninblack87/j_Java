package Study.OrderProcessingSystem;

public class OrderProcessingSystem {
    public static void main(String[] args) {
        
        // 여러 제품 객체를 생성
        Product computer = new Product(1000000, 10001, "컴퓨터");
        Product printer = new Product( 200000, 10002, "프린터");
        
        // 주문 객체를 생성
        Order o1 = new Order(1);

        // 주문에 제품을 추가
        o1.addProduct(printer);
        o1.addProduct(computer);

        // 주문한 제품의 정보를 출력
        o1.printOrderDetails();

    }
}
