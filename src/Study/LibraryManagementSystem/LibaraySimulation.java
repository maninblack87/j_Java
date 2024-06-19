package Study.LibraryManagementSystem;

import java.util.Scanner;

public class LibaraySimulation {

    // 사용자가 도서를 추가하거나 삭제하고 도서 목록을 검색하고 
    // 출력할 수 있는 간단한 콘솔 기반 인터페이스를 제공한다.

    public static void main(String[] args) {
        
        Library lib = new Library();

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("_____________ 도서관 서비스 ______________");
            System.out.println("1.전체조회\n2.조회\n3.추가\n4.삭제\n5.종료");
            System.out.print("서비스를 선택해주세요: ");
            String serviceInput = scan.nextLine();

            if(serviceInput.equals("1")){               // 전체조회 서비스

                lib.displayBooks();

            } else if(serviceInput.equals("2")){        // 조회 서비스

                System.out.print("조회하실 도서명을 입력해주세요: ");
                String iptTitle = scan.nextLine();

                lib.findBook(iptTitle);
                
            } else if(serviceInput.equals("3")){        // 추가 서비스

                System.out.print("책의 제목/저자/출판년도/가격을 아래와 같은 형식으로 공백을 주어 입력해주세요(제목 저자 출판년도 가격): ");
                String input = scan.nextLine();
                String[] token = input.split(" ");

                // 입력이 안내된대로 되었는지 체크
                if (token.length == 4){
                    String iptTitle  = token[0];
                    String iptAuthor = token[1];
                    int    iptYear   = Integer.parseInt(token[2]);
                    int    iptPrice  = Integer.parseInt(token[3]);

                    Book addbook = new Book(iptTitle, iptAuthor, iptYear, iptPrice);
                    lib.addBook(addbook);
                }else{
                    System.out.println("입력방식이 잘못되었습니다. 책 추가 서비스를 취소합니다.");
                    continue;
                }
                
            } else if(serviceInput.equals("4")){      // 삭제 서비스

                System.out.print("삭제하실 도서명을 입력해주세요: ");
                String iptTitle = scan.nextLine();

                lib.removeBook(iptTitle);

            } else if(serviceInput.equals("5")){       // 서비스 종료

                System.out.println("도서관 서비스를 종료합니다.");
                break;

            } else{

                System.out.println("잘못된 입력입니다.");
                continue;

            }

        }

        scan.close();

    }
    
}
