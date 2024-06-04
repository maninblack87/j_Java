package Study.CarManagement;

public class Sedan extends Car {
    // 변수
    private int trunkCapacity;
    
    // 생성자
    public Sedan(String brand, String model, int speed, int trunkCapacity){
        super(brand, model, speed);
        this.trunkCapacity = trunkCapacity;
    }

    // get함수
    private int getTrunkCapacity(){
        return trunkCapacity;
    }

    // 트렁크 용량 설정
    public void setTrunkCapacity(int trunkCapacity){
        this.trunkCapacity = trunkCapacity;
    }

    // 차량 정보 표시
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Trunk Capacity: %d\n", trunkCapacity);
    }
}
