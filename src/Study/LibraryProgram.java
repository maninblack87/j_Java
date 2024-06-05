package Study;

// 사용자에게 선택지를 제공 >> 도서 추가, 삭제, 조회 수행  (메서드로 구현, 기본적인 예외처리 포함)
// 조회시 제목을 통해 조회
// 추가시 제목은 중복 될 수 없다
// 삭제 및 조회시 존재하지 않는 도서가 있다면 오류메세지 출력

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryProgram {

    // 변수 선언 및 초기화
    private ArrayList<String> books = new ArrayList<>();

    // 생성자
    public LibraryProgram() throws Exception{

        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 사용자에게 선택지를 제공 : 도서 추가/ 삭제/ 조회
        // 무한 루프를 줘서 사용자가 원하는 만큼 서비스를 수행할 수 있도록 한다.
        do{

            // 선택된 서비스 호출 및 서비스 수행
            switch (selectService(scan)){
                case 1:
                    search(scan);
                    break;
                case 2:
                    add(scan);
                    break;
                case 3:
                    delete(scan);
                    break;
                case 4:
                    showBooksList();
                    break;
                default:
                    System.out.println("주의 : 서비스 선택을 위해 서비스 항목의 숫자를 입력해주세요.");
                    continue;
            }

            // 서비스를 계속하거나 종료한다
            if (checkContinueInput(scan) == true){
                continue;
            }else{
                System.out.println("도서관 서비스를 종료합니다.");
                break;
            }

        }while(true);

        // scan 종료
        scan.close();

    }

    // 도서관 서비스 선택하는 함수
    private int selectService(Scanner scan) throws Exception{
        System.out.println("\n*-------------------* 도서관 서비스 *-------------------*");
        System.out.println("1. 도서 조회\n2. 도서 추가\n3. 도서 삭제");
        System.out.print("도서관 서비스를 선택해주세요: ");
        return scan.nextInt();
    }

    // 조회 함수
    private void search(Scanner scan) throws Exception{
        String searchTitle;
        System.out.print("조회할 도서 제목: ");
        searchTitle = scan.next();
        if (checkIsContained(searchTitle)){                                               // 조회한 도서가 존재하는지 확인
            System.out.printf("찾으시는 도서가 존재합니다: %s\n", searchTitle);
        }else{
            System.out.println("찾으시는 도서가 존재하지 않습니다.");
        }
    }

    // 추가 함수
    private void add(Scanner scan) throws Exception{
        String addTitle;
        System.out.print("추가할 도서 제목: ");
        addTitle = scan.next();
        if (checkIsContained(addTitle)){
            System.out.printf("이미 존재하는 도서입니다: %s\n", addTitle);
        }else{
            books.add(addTitle);
            System.out.printf("해당 도서가 추가되었습니다: %s\n", addTitle);
        }
    }

    // 삭제 함수
    private void delete(Scanner scan) throws Exception{
        String deleteTitle;
        System.out.print("삭제할 도서 제목: ");
        deleteTitle = scan.next();
        if (checkIsContained(deleteTitle)){
            books.remove(deleteTitle);
            System.out.printf("해당 도서가 삭제되었습니다: %s\n", deleteTitle);
        }else{
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }
    }

    // 전체 도서 현황
    private void showBooksList(){
        if (books.size() == 0){
            System.out.println("도서 목록에 갱신된 정보가 없습니다.");
        }
        for (int i = 0; i < books.size(); i++){
            System.out.printf("도서 id=%d, 제목=%s\n", i, books.get(i));
        }
    }

    // 입력한 도서가 도서 목록에 포함되었는지 체크하는 함수
    private Boolean checkIsContained(String title) throws Exception{
        Boolean isContained = false;
        for (String book : books){
            if (book.equals(title)){
                isContained = true;
                break;
            }else{
                isContained = false;
                continue;
            }
        }
        return isContained;
    }

    // 도서 입력을 계속 진행할지 묻는 함수
    private Boolean checkContinueInput(Scanner scan) throws Exception{
        Boolean isContinue = false;
        do{
            System.out.print("계속하시겠습니까?(y/n)");
            String yn = scan.next();
            if(yn.equals("y") || yn.equals("")){
                isContinue = true;
                break;
            }else if(yn.equals("n")){
                isContinue = false;
                break;
            }else{
                System.out.println("동의하시면 y, 그렇지 않으면 n을 입력해주세요.");
                continue;
            }
        }while(true);
        return isContinue;
    }

    public static void main(String[] args) {
        
        try {
            LibraryProgram myLibrary = new LibraryProgram();
        } catch(Exception e){
            System.err.println("예외 발생: " + e.getMessage());
        }
    }
}
