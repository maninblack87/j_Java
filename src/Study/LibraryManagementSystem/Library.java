package Study.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String title){
        boolean isRemove = false;
        for (Book book : books){
            if (book.getTitle().equals(title)){
                books.remove(book);
                isRemove = true;
                break;
            }
        }
        if (isRemove){
            System.out.println("정상적으로 삭제되었습니다\n");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다\n");
        }
    }

    public void findBook(String title){
        boolean isFind = false;
        for (Book book : books){
            if (book.getTitle().equals(title)){
                System.out.println(book.toString());
                isFind = true;
            }
        }
        if (isFind){
            System.out.println("해당 도서의 조회가 완료되었습니다\n");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다\n");
        }
    }

    public void displayBooks(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
    
}
