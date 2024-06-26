package Study.VehicleManagementSystem;

public class FleetManagementSystem {
    public static void main(String[] args) {
        // 랜덤 객체 생성
        NumberGenerator numberGenerator = new NumberGenerator();

        // 차량 2대 생성
        Vehicle car1 = new Vehicle(numberGenerator.GenerateNumber(), "브랜드1", "모델1", 2024, 0);
        Vehicle car2 = new Vehicle(numberGenerator.GenerateNumber(), "브랜드2", "모델2", 2024, 0);

        // 차량 첫 운행
        car1.updateMileage(100);
        car2.updateMileage(150);

        // 치량 정보 출력
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // 차량 두번째 운행
        car2.updateMileage(50);

    }
}
