package Study.Examples;

// 3번 예제문제--> 도서관 시스템을 모델링한 'Book'클래스와 이를 활용한 도서 관리 프로그램을 작성해보세요.

// 1.'Book'클래스를 정의하고 다음과 같은 속성과 메서드를 포함한다.
// -속성:title(책 제목). author(저자),isbn(ISBN번호)
// -메서드:displayBookInfo()(책 정보를 출력하는 메서드)

// 2.'Library'클래스를 정의하고 다음과 같은 속성과 메서드를 포함하세요.
// -속성: 'books'(도서리스트)
// -메서드: addBook(Book book)(책 추가하는 메서드), removeBook(String isbn)(ISBN번호로 책을 제거하는 메서드)
//               displayAllbooks()(모든 책을 정보를 출력하는 메서드)
// 3.'Book'클래스를 사용하여 여러 개의 책 객체를 생성하고 'Library'클래스에 책을 추가하고 제거하여 도서관의 모든 책 정보를 출력한다.

import java.util.ArrayList;

class Book{
    protected String title;
    protected String author;
    private String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookInfo(){
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("ISBN번호: " + isbn);
    }
}

class Library{
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String title){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).title.equals(title)){
                books.remove(i);
                break;
            }
        }
    }

    public void displayAllBooks(){
        System.out.println("Library Books:");
        for (Book book : books){
            book.displayBookInfo();
        }
    }
}

public class Quiz240531_3 {
    public static void main(String[] args){
        Book book1 = new Book("수제비 2024","윤영빈 외","1111111111");
        Book book2 = new Book("Power Java", "천인국 외", "2222222222");
        
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.displayAllBooks();

        library.removeBook("2222222222");

        library.displayAllBooks();
    }
}
