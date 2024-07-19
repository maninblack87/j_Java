package Study.TeamProject.samples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 메인 메서드를 수행하는 클래스
public class TestGUI {
    // __메인 메서드__
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}

// __메인 프레임__
class MainFrame extends JFrame {
    // 패널 3개 생성
    private PurchaseCalculatorPanel purchasePanel;      // 구매 패널
    private StudentPaymentPanel paymentPanel;           // 입금 패널
    private SummaryPanel summaryPanel;                  // 구매 요약 패널

    // 생성자
    public MainFrame() {
        // 프레임 설정
        setTitle("통합 프로그램");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 탭 패널 생성
        JTabbedPane tabbedPane = new JTabbedPane();

        // 비품 관리 패널 추가
        purchasePanel = new PurchaseCalculatorPanel();
        tabbedPane.addTab("비품 관리", purchasePanel);

        // 학생별 입금 내역 패널 추가
        paymentPanel = new StudentPaymentPanel();
        tabbedPane.addTab("학생별 입금 내역", paymentPanel);

        // 요약 패널 추가
        summaryPanel = new SummaryPanel(purchasePanel, paymentPanel);
        tabbedPane.addTab("요약", summaryPanel);

        // 탭 패널을 프레임에 추가
        add(tabbedPane);

        // 프레임 표시
        setVisible(true);
    }
}

// 비품 관리(메인) 패널 클래스
class PurchaseCalculatorPanel extends JPanel {
    private JTextField itemNameField;
    private JTextField itemPriceField;
    private JTextField studentCountField;
    private JLabel resultLabel;
    private int totalPricePerStudent;
    private int totalPrice;

    // 생성자
    public PurchaseCalculatorPanel() {
        setLayout(null);

        // 비품명 라벨 및 텍스트 필드
        JLabel itemNameLabel = new JLabel("비품 명:");
        itemNameLabel.setBounds(10, 20, 80, 25);
        add(itemNameLabel);

        itemNameField = new JTextField(20);
        itemNameField.setBounds(100, 20, 165, 25);
        add(itemNameField);

        // 비품 가격 라벨 및 텍스트 필드
        JLabel itemPriceLabel = new JLabel("비품 가격:");
        itemPriceLabel.setBounds(10, 50, 80, 25);
        add(itemPriceLabel);

        itemPriceField = new JTextField(20);
        itemPriceField.setBounds(100, 50, 165, 25);
        add(itemPriceField);

        // 학생 수 라벨 및 텍스트 필드
        JLabel studentCountLabel = new JLabel("학생 수:");
        studentCountLabel.setBounds(10, 80, 80, 25);
        add(studentCountLabel);

        studentCountField = new JTextField(20);
        studentCountField.setBounds(100, 80, 165, 25);
        add(studentCountField);

        // 계산 버튼
        JButton calculateButton = new JButton("계산");
        calculateButton.setBounds(10, 110, 80, 25);
        add(calculateButton);

        // 결과 라벨
        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 140, 300, 25);
        add(resultLabel);

        // 버튼에 리스너 추가
        calculateButton.addActionListener(new CalculateButtonListener());
    }

    // 버튼 이벤트 : 비품 구매를 위한 학생 1인당 분담비용을 계산
    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // 변수정의
                String itemName = itemNameField.getText();                              // 비품 이름
                totalPrice = Integer.parseInt(itemPriceField.getText());                // 비품 가격(1인당 분담금을 통합한 총 분담금)
                int studentCount = Integer.parseInt(studentCountField.getText());       // 학생 수

                // ** 알수없음
                if (studentCount == 0) {
                    throw new ArithmeticException();
                }

                // 1인당 분담금 계산
                totalPricePerStudent = totalPrice / studentCount;

                // 계산 결과 표시
                resultLabel.setText(itemName + " 학생당 비용: " + totalPricePerStudent + "원");

            // 오류1
            } catch (NumberFormatException ex) {
                resultLabel.setText("유효한 숫자를 입력하세요.");

            // 오류2
            } catch (ArithmeticException ex) {
                resultLabel.setText("학생 수가 0일 수 없습니다.");
            }
        }
    }

    // 이하 get함수
    public int getTotalPricePerStudent() {
        return totalPricePerStudent;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}

// 학생별 입금내역 패널 클래스
class StudentPaymentPanel extends JPanel {
    private JTextField[] paymentFields;
    private JLabel resultLabel;
    private int totalPayments;
    private String[] studentNames;

    // 생성자
    public StudentPaymentPanel() {
        setLayout(null);
        studentNames = new String[]{"전석환", "조승현", "백진홍", "윤상배", "심영도"};
        paymentFields = new JTextField[studentNames.length];

        // 학생별 입금 내역 라벨 및 텍스트 필드
        JLabel titleLabel = new JLabel("학생별 입금 내역");
        titleLabel.setBounds(10, 10, 200, 25);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(titleLabel);

        // 반복문으로 각 학생별 이름과 입금 금액을 표시하는 시각적 요소 표시
        for (int i = 0; i < studentNames.length; i++) {
            JLabel studentLabel = new JLabel(studentNames[i] + ":");
            studentLabel.setBounds(10, 50 + (i * 40), 80, 25);
            add(studentLabel);

            paymentFields[i] = new JTextField(20);
            paymentFields[i].setBounds(100, 50 + (i * 40), 165, 25);
            add(paymentFields[i]);
        }

        // 합계 버튼
        JButton sumButton = new JButton("합계버튼");
        sumButton.setBounds(10, 270, 120, 25);
        add(sumButton);

        // 결과 라벨
        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 300, 300, 25);
        add(resultLabel);

        // 버튼에 리스너 추가
        sumButton.addActionListener(new SumButtonListener());
    }

    // 버튼 이벤트 : 학생별 입금내역 총합 계산
    private class SumButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totalPayments = 0;
            try {
                for (JTextField paymentField : paymentFields) {
                    int payment = Integer.parseInt(paymentField.getText());
                    totalPayments += payment;
                }
                resultLabel.setText("총 합계: " + totalPayments + "원");
            } catch (NumberFormatException ex) {
                resultLabel.setText("유효한 숫자를 입력하세요.");
            }
        }
    }

    // 이하 get함수
    public int getTotalPayments() {
        return totalPayments;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public JTextField[] getPaymentFields() {
        return paymentFields;
    }
}

// 요약정보 패널 클래스
class SummaryPanel extends JPanel {
    private JLabel summaryLabel;
    private PurchaseCalculatorPanel purchasePanel;
    private StudentPaymentPanel paymentPanel;

    // 생성자
    public SummaryPanel(PurchaseCalculatorPanel purchasePanel, StudentPaymentPanel paymentPanel) {
        this.purchasePanel = purchasePanel;
        this.paymentPanel = paymentPanel;

        setLayout(null);

        // 요약 정보 라벨
        summaryLabel = new JLabel("요약 정보");
        summaryLabel.setBounds(10, 10, 300, 25);
        summaryLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(summaryLabel);

        // 요약 버튼
        JButton summaryButton = new JButton("요약");
        summaryButton.setBounds(10, 50, 80, 25);
        add(summaryButton);

        // 요약 결과 라벨
        JLabel resultSummaryLabel = new JLabel("");
        resultSummaryLabel.setBounds(10, 90, 600, 300);
        add(resultSummaryLabel);

        // 버튼에 리스너 추가
        summaryButton.addActionListener(e -> {
            // 변수 선언 및 초기화
            int totalPrice = purchasePanel.getTotalPrice();
            int totalPayments = paymentPanel.getTotalPayments();
            int balance = totalPayments - totalPrice;

            // 총 물품가격, 총 입금, 잔액 표시
            StringBuilder summary = new StringBuilder("<html>");
            summary.append("총 물품 가격: ").append(totalPrice).append("원<br>");
            summary.append("총 입금: ").append(totalPayments).append("원<br>");
            summary.append("잔액: ").append(balance).append("원<br><br>");

            // 변수 선언 및 초기화
            JTextField[] paymentFields = paymentPanel.getPaymentFields();           // 학생별 입금내역으로부터 텍스트 필드(1인당 각 입금금액이 표시된) 배열
            String[] studentNames = paymentPanel.getStudentNames();                 // 학생별 입금내역으로부터 모든 학생들의 이름

            // 반복문으로 학생별 입금내역 표시
            for (int i = 0; i < paymentFields.length; i++) {
                summary.append(studentNames[i]).append(": ").append(paymentFields[i].getText()).append("원<br>");
            }
            summary.append("</html>");

            resultSummaryLabel.setText(summary.toString());
        });
    }
}
