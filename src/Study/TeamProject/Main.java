package Study.TeamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static class Product {
        String name;
        double price;
        String paidStudentName;

        Product(String name, double price, String paidStudentName) {
            this.name = name;
            this.price = price;
            this.paidStudentName = paidStudentName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        while (true) {
            System.out.println("1. 비품 목록 보기");
            System.out.println("2. 비품 구매하기");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기

            if (choice == 1) {
                for (Product product : productList) {
                    System.out.println("비품 이름: " + product.name + ", 가격: " + product.price + ", 부담한 학생: " + product.paidStudentName);
                }
            } else if (choice == 2) {
                System.out.print("비품 이름: ");
                String name = scanner.nextLine();
                System.out.print("비품 가격: ");
                double price = scanner.nextDouble();
                scanner.nextLine();  // 버퍼 비우기
                System.out.print("부담한 학생 이름: ");
                String studentName = scanner.nextLine();
                productList.add(new Product(name, price, studentName));
                System.out.println("비품이 추가되었습니다.");
            } else if (choice == 3) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }
        scanner.close();
    }
}