package Study;

import java.util.ArrayList;
import java.util.Scanner;

// 클래스 : 책
class Book{

    // 변수 선언
    private String title;
    private String author;
    private int price;

    // 생성자
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // get함수
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }

    public void displayInfo(){
        System.out.printf("%s , %s , %d원\n", getTitle(), getAuthor(), getPrice());
    }

}

// 클래스 도서관 관리 시스템
public class LibrayManagementSystem {

    // 정적 변수 선언 및 초기화
    public static ArrayList<Book> books = new ArrayList<>();
    public static Book bookPointer;                                 // <- 해당 변수는 Book클래스가 노출되어 보안공격에 대한 취약성이 생겨 좋지않다!!

    // 모든 도서 현황 표시
    public static void displayAllBooks(){
        System.out.println("------------------- 도서관 도서 현황 -----------------------*");
        for (Book book : books){
            book.displayInfo();
        }
        System.out.println("-----------------------------------------------------------*\n");
    }

    // 도서를 추가
    public static void addBook(String title, String author, int price){
        Book book = new Book(title, author, price);
        books.add(book);
    }

    // 도서를 삭제
    public static void removeBook(String title){
        // if (checkIsBook(title)){
        //     books.remove(bookPointer);
        //     System.out.println("해당 도서를 정상적으로 삭제했습니다.");
        // } else {
        //     System.out.println("해당 도서를 찾을 수 없어 삭제가 불가능합니다.");
        // }
        boolean removed = false; // 책이 제거되었는지 여부를 나타내는 변수

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) { // 책을 찾았다면
                books.remove(i); // 목록에서 책을 제거
                removed = true; // 책이 제거되었음을 표시
                break; // 더 이상 반복할 필요가 없으므로 반복문을 종료
            }
        }

        // 책이 제거되었는지 여부에 따라 적절한 메시지를 출력
        if (removed) {
            System.out.println("해당 도서를 정상적으로 삭제했습니다.");
        } else {
            System.out.println("해당 도서를 찾을 수 없어 삭제가 불가능합니다.");
        }

    }

    // 도서를 조회
    public static void searchBook(String title){
        if (checkIsBook(title)){
            System.out.println("------------------- 도서 정보 -----------------------*");
            bookPointer.displayInfo();
        } else {
            System.out.println("해당 도서를 찾을 수 없어 조회가 불가능합니다.");
        }
    }

    // 매개변수인 도서가 도서관에 존재하는지 체크
    public static Boolean checkIsBook(String title){
        Boolean isBook = false;
        for (Book book : books){
            if (title.equals(book.getTitle())){
                isBook = true;
                bookPointer = new Book(book.getTitle(), book.getAuthor(), book.getPrice());     // 북 포인터를 정의한다
                break;
            }
        }
        return isBook;
    }



    public static void main(String[] args){

        // 임시로 책을 몇개 추가한다
        Book b1 = new Book("책이름1", "저자1", 10000);
        Book b2 = new Book("책이름2", "저자2", 12000);

        // 임시로 추가한 책들을 books 배열에 추가한다.
        books.add(b1);
        books.add(b2);

        //
        displayAllBooks();

        // Scanner 객체 scan 생성
        Scanner scan = new Scanner(System.in);

        // <테스트> 책 추가
        System.out.println("<테스트> 책 7권을 추가한다\n");
        addBook("책이름3", "저자3", 10000);
        addBook("책이름4", "저자4", 14000);
        addBook("책이름5", "저자5", 15000);
        addBook("책이름6", "저자6", 16000);
        addBook("책이름7", "저자7", 18000);
        addBook("책이름8", "저자8", 19000);
        addBook("책이름9", "저자9", 20000);
        displayAllBooks();

        // <테스트> 책 삭제
        System.out.println("<테스트> 책 2권(책이름9, 책이름10)을 삭제한다\n");
        removeBook("책이름9");
        removeBook("책이름10");
        displayAllBooks();

        // <테스트> 책 조회
        System.out.println("<테스트> 책 2권(책이름1, 책이름9)을 검색한다\n");
        searchBook("책이름1");
        searchBook("책이름9");
        displayAllBooks();

        // <테스트> 도서 현황 조회
        displayAllBooks();

        // scan 종료
        scan.close();

    }
    
}