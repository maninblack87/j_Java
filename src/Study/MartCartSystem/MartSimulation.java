package Study.MartCartSystem;

public class MartSimulation {
    
    public static void main(String[] args) {

        // 제품 목록
        Product water = new Product("00000001", "물", 1000);
        Product orangeJuice = new Product("00000002", "오렌지주스", 1000);
        Product mangoJuice = new Product("000000003", "망고주스", 1200);
        Product grapeJuice = new Product("00000004", "포도주스", 1100);
        Product saewookkang = new Product("00010001", "새우깡", 1400);
        Product jagalchi = new Product("00010002", "자갈치", 1300);

        // 장바구니 생성
        Cart c1 = new Cart();
        c1.addItem(water);
        c1.addItem(saewookkang);
        c1.addItem(water);
        c1.removeItem("00000001");
        c1.displayCart();
        
        // 장바구니 c1 계산 처리
        Payment p1 = new Payment(c1.calculateTotalPrice());
    }
}
