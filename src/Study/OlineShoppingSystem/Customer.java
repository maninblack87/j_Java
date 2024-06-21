package Study.OlineShoppingSystem;

public class Customer {
    private String customerId;
    private String name;
    private String address;

    public Customer(String customerId, String name, String address){
        this.customerId = customerId;
        this.name       = name;
        this.address    = address;
    }

    // get함수
    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return "고객 아이디: " + getCustomerId() + " / 고객명: " + getName() + " / 고객 주소: " + getAddress();
    }
}
