package Study.VehicleManagementSystem;

public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private int year;
    private int mileage;

    public Vehicle(String plateNumber, String brand, String model, int year, int mileage){
        this.plateNumber = plateNumber;
        this.brand       = brand;
        this.model       = model;
        this.year        = year;
        this.mileage     = mileage;
    }

    public String getPlateNumber(){
        return plateNumber;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getMileage(){
        return mileage;
    }

    public void updateMileage(int newMileage){
        this.mileage += newMileage;
    }

    @Override
    public String toString(){
        String carInfo = "--------------< 차량 번호 >--------------\n";
        carInfo += "차량번호 : " + plateNumber + "\n";
        carInfo += "브랜드   : " + brand + "\n";
        carInfo += "모델     : " + model + "\n";
        carInfo += "연식     : " + year + "\n";
        carInfo += "주행거리 : " + mileage + "\n";

        return carInfo;
    }

}
