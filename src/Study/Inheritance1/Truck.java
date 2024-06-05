package Study.Inheritance1;

public class Truck extends Car {
    // 변수
    private int loadCapacity;

    // 생성자
    public Truck(String brand, String model, int speed, int loadCapacity){
        super(brand, model, speed);
        this.loadCapacity = loadCapacity;
    }

    // get함수
    private int getLoadCapacity(){
        return loadCapacity;
    }

    // 트럭 적재량 설정
    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    // 차량 정보 표시
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("LoadCapacity: %d\n", loadCapacity);
    }
}
