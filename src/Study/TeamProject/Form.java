package Study.TeamProject;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;         // # 테스트를 위해 임시로! 불러온 라이브러리

public class Form extends JFrame {

    // # 테스트용 배열
    ArrayList<Student> students;

    public Form(){

        // # students 배열에 테스트용 학생 추가
        students = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Student student = new Student("학생"+i);
            students.add(student);
        }
        

        // 프레임을 생성 및 설정
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("비품 구매 관리 프로그램");

        


        // 패널1 생성 및 설정
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500, 200));
        panel1.setBorder(BorderFactory.createTitledBorder("비품 정보"));
        // 패널1을 배치한다
        frame.add(panel1);

        // 패널1_1 생성 및 설정
        JPanel panel1_1 = new JPanel();
        panel1_1.setPreferredSize(new Dimension(250, 150));
        panel1_1.setBorder(BorderFactory.createTitledBorder("비품 정보 입력"));
        
        // 패널1_1의 요소 생성 및 설정
        JLabel     productName = new JLabel("비품이름");
        JTextField iptProdName = new JTextField(15);
        JLabel     productPrice = new JLabel("제품가격");
        JTextField iptProdPrice = new JTextField(15);
        JButton    registerProd = new JButton("등록");

        // 패널1_2 생성 및 설정
        JPanel panel1_2 = new JPanel();
        panel1_2.setPreferredSize(new Dimension(200, 150));
        panel1_2.setBorder(BorderFactory.createTitledBorder("1인당 송금 액수"));

        // 패널1_2 생성 및 설정
        JLabel     payment = new JLabel("분담액");
        JTextField showPayment = new JTextField(10);
        showPayment.setEnabled(false);
        
        // 패널1의 레이아웃 배치
        panel1.add(panel1_1);
        panel1.add(panel1_2);
        panel1_1.add(productName);
        panel1_1.add(iptProdName);
        panel1_1.add(productPrice);
        panel1_1.add(iptProdPrice);
        panel1_1.add(registerProd);
        panel1_2.add(payment);
        panel1_2.add(showPayment);



        // 패널2 생성 및 설정
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(300, 400));
        panel2.setBorder(BorderFactory.createTitledBorder("학생 정보"));
        // 레이아웃을 배치한다
        frame.add(panel2);

        // 패널2의 요소 생성 및 설정
        for (Student student : students){
            JPanel students = new JPanel();
            students.setPreferredSize(new Dimension(280, 30));
            JLabel  studentName = new JLabel(student.getName());
            studentName.setPreferredSize(new Dimension(70, 20));
            JLabel  studentIsPaid = new JLabel(student.getIsPaid());
            studentIsPaid.setPreferredSize(new Dimension(70, 20));
            JButton confirmIsPaid = new JButton("지불확인");
            confirmIsPaid.setPreferredSize(new Dimension(90, 20));
            // 각 요소들 배치
            panel2.add(students);
            students.add(studentName);
            students.add(studentIsPaid);
            students.add(confirmIsPaid);
        }
        


        // 패널3 생성 및 설정
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(200, 400));
        // 레이아웃을 배치한다
        frame.add(panel3);

        // 패널3_1 생성
        JPanel panel3_1 = new JPanel();
        panel3_1.setPreferredSize(new Dimension(200, 200));
        panel3_1.setBorder(BorderFactory.createTitledBorder("결과"));

        // 패널3_1의 요소 생성 및 설정
        JLabel totalPayment = new JLabel("총 지불액");
        JTextField showTotalPayment = new JTextField(15);
        JLabel remainedPayment = new JLabel("앞으로 남은금액");
        JTextField showRemainedPayment = new JTextField(15);
        showRemainedPayment.setEnabled(false);

        // 패널3_2 생성
        JPanel panel3_2 = new JPanel();
        panel3_2.setPreferredSize(new Dimension(200, 190));
        panel3_2.setBorder(BorderFactory.createTitledBorder("구매"));

        // 패널3_2의 요소 생성 및 설정
        JButton purchase = new JButton("구매");

        // 패널3의 레이아웃 배치
        panel3.add(panel3_1);
        panel3.add(panel3_2);
        panel3_1.add(totalPayment);
        panel3_1.add(showTotalPayment);
        panel3_1.add(remainedPayment);
        panel3_1.add(showRemainedPayment);
        panel3_2.add(purchase);

        

        
        

        // 프레임을 표시한다
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Form f = new Form();
    }
}
