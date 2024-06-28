package Study.OrderProcessingSystem;

public class Product {
    private double price;
    private int productId;
    private String productName;

    public Product(double price, int productId, String productName){
        this.price = price;
        this.productId = productId;
        this.productName = productName;
    }

    //get함수
    public String getProductName(){
        return productName;
    }
    public int getProductId(){
        return productId;
    }
    public double getPrice(){
        return price;
    }

}
