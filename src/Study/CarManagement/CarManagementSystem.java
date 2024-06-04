package Study.CarManagement;

import java.util.ArrayList;

public class CarManagementSystem {
    // 변수
    private ArrayList<Car> cars;

    // 생성자
    public CarManagementSystem(){
        cars = new ArrayList<>();
    }

    // 차량 항목 추가
    public void addCar(Car car){
        cars.add(car);
    }

    // 차량 항목 제거
    public void removeCar(Car car){
        cars.remove(car);
    }

    // 모든 차량 정보 표시
    public void displayAllCars(){
        for (Car car : cars){
            car.displayInfo();
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args){

        // 카 매니저 생성
        CarManagementSystem carManager = new CarManagementSystem();

        // 세단 객체 생성
        Sedan sedan = new Sedan("Toyota", "Camry", 150, 500);
        Truck truck = new Truck("Ford", "F-150", 100, 1000);

        carManager.addCar(sedan);
        carManager.addCar(truck);

        carManager.displayAllCars();

        sedan.drive6hours();
        truck.drive6hours();

        System.out.println("시운전 후");
        carManager.displayAllCars();
        
    }
}
