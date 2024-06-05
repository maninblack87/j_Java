package Study.Inheritance1;

public class Car {
    // 변수
    private String brand;
    private String model;
    private int speed;
    private int distance_traveled = 0;

    // 생성자
    public Car(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // get함수
    private String brand(){
        return brand;
    }
    private String model(){
        return model;
    }
    private int speed(){
        return speed;
    }

    // 6시간 주행하면 얼마나 가는지 거리 구하기
    public void drive6hours(){
        distance_traveled += (speed * 6);
        System.out.printf("%s의 6시간 주행거리: %d\n", model, distance_traveled);
        System.out.println("-------------------------------");
    }

    // 차량 정보 표시
    public void displayInfo(){
        System.out.printf("Brand: %s\nModel: %s\nSpeed: %d\n", brand, model, speed);
    }
}
