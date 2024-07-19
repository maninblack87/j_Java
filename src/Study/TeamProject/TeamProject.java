package Study.TeamProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// 숫자를 만드는 클래스
class Number {
    // 속성 선언
    private int num;
    // 생성자
    public Number(int num){
        this.num = num;
    }
    // 리턴 함수
    public int getNumber(){
        return num;
    }
}

// 프레임을 생성하는 클래스
class MyFrame {
    // 속성 선언
    private JFrame frame;
    private JPanel panel;
    private JTextField iptNum1;
    private JTextField iptNum2;
    private JLabel showOpPlus; 
    private JButton button;
    private JLabel showResult;

    // 생성자
    public MyFrame(){

        // 새 프레임
        frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("테스트");

        // 새 패널
        panel = new JPanel();
        frame.add(panel);

        // 숫자 입력창1
        iptNum1 = new JTextField(5);
        panel.add(iptNum1);

        // 레이블 연산자 +
        showOpPlus = new JLabel(" + ");
        panel.add(showOpPlus);

        // 숫자 입력창2
        iptNum2 = new JTextField(5);
        panel.add(iptNum2);

        // 결과를 출력하는 버튼
        button = new JButton(" = ");
        panel.add(button);
        button.addActionListener(new MyListener());

        // 결과 표시
        showResult = new JLabel();
        panel.add(showResult);

        // 프레임 표시
        frame.setVisible(true);
    }

    // 버튼을 클릭하면 결과가 나오는 클래스
    private class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == button){
                Number num1 = new Number(Integer.parseInt(iptNum1.getText()));
                Number num2 = new Number(Integer.parseInt(iptNum2.getText()));

                showResult.setText(String.valueOf(num1.getNumber()+num2.getNumber()));
            }
        }
    }
}

public class TestGUI {

    public static void main(String[] args) {

        MyFrame f = new MyFrame();
        
    }
    
}
