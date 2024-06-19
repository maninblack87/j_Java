package Study.LibraryManagementSystem;

public class Book {

    private String title;
    private String author;
    private int    year;
    private double price;

    public Book(String title, String author, int year, double price){
        this.title  = title;
        this.author = author;
        this.year   = year;
        this.price  = price;
    }

    // get메소드
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public double price(){
        return price;
    }

    public String toString(){
        return "제목: " + title + " / 저자: " + author + " / 출판연도: " + year + " / 가격: " + price;
    }

}
