package Study.OlineShoppingSystem;

import Study.MartCartSystem.Product;

import java.util.ArrayList;

public class OnlineShoppingSimulation {

    // 실제로 바구니에 담은 상품들을 반환하는 함수
    public static ArrayList<Product> orderProductsList(Product... x){
        ArrayList<Product> products = new ArrayList<>();
        for(Product i : x){
            products.add(i);
        }
        return products;
    }

    public static void main(String[] args) {

        // 제품 목록
        // - Product 클래스는 Study.MartCartSystem 패키지에 있는 Product 클래스로 대신 사용함
        Product water = new Product("00000001", "물", 1000);
        Product orangeJuice = new Product("00000002", "오렌지주스", 1000);
        Product mangoJuice = new Product("00000003", "망고주스", 1200);
        Product grapeJuice = new Product("00000004", "포도주스", 1100);
        Product saewookkang = new Product("00010001", "새우깡", 1400);
        Product jagalchi = new Product("00010002", "자갈치", 1300);

        // 고객 생성
        Customer c1 = new Customer("안진상고객", "안진상", "경기도 고양시");

        // 주문 생성
        Order order1 = new Order(1, c1, orderProductsList(water, orangeJuice, saewookkang, grapeJuice));

        // 주문 표시
        order1.displayOrder();

        // 고객 생성2
        Customer c2 = new Customer("노진상고객", "노진상", "경기도 고양시");

        // 주문 생성
        Order order2 = new Order(2, c2, orderProductsList(mangoJuice, mangoJuice, jagalchi, jagalchi, water));

        // 주문 표시
        order2.displayOrder();

    }
    
}
