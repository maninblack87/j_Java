package Study.MartCartSystem;

public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String id, String name, double price){
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    //get함수
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }

    public String toString(){
        return "제품ID: " + productId + " / 제품명: " + productName + " / 판매가: " + price;
    }

}
