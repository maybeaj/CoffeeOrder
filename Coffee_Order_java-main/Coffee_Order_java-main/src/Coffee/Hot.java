package Coffee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Hot {
	
public void HotAmericano(JPanel Hotpn, JTextArea ordertxt) {
	  // Hotpn에 생성할 이지지 버튼들을 설정
    JButton HotButton_아메리카노 = new JButton("");
    HotButton_아메리카노.setIcon(new ImageIcon("images/뜨아.jpg"));
    Hotpn.add(HotButton_아메리카노);
    HotButton_아메리카노.setBounds(20, 20, 150,270);
    //메뉴이름 띄어줄 텍스트 필드 생성
    JTextField hot_아메리카노 = new JTextField("(HOT)아메리카노  1500원"); 
    Hotpn.add(hot_아메리카노);
    hot_아메리카노.setBounds(20,290,150,20);
    hot_아메리카노.setEditable(false);
    
    // 아메리카노를 누르면 알림창이 뜨게끔 기능 설정
    HotButton_아메리카노.addActionListener(new ActionListener () {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                JButton srcBtn =(JButton)e.getSource();
                 if(srcBtn==HotButton_아메리카노) {
             int result=   JOptionPane.showConfirmDialog(HotButton_아메리카노, "아메리카노를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                    if(result == JOptionPane.OK_OPTION) {
                       ordertxt.append((CoffeeSystem.hot_drink.get(0).toString()));
                       CoffeeSystem.order.add(CoffeeSystem.hot_drink.get(0));
                       CoffeeSystem.new_Price(1500);
                    }
                 }
             }});
}

public void HotCappucino(JPanel Hotpn, JTextArea ordertxt) {
	JButton HotButton_카푸치노 = new JButton("");
    HotButton_카푸치노.setIcon(new ImageIcon("images/뜨카.jpg"));
    Hotpn.add(HotButton_카푸치노);
    HotButton_카푸치노.setBounds(210, 20, 150, 270);
    //메뉴이름 띄어줄 텍스트 필드 생성
    JTextField 카푸치노 = new JTextField("(HOT)카푸치노  2000원"); 
    Hotpn.add(카푸치노);
    카푸치노.setBounds(210,290,150,20);
    카푸치노.setEditable(false);
    // 카푸치노를 누르면 알림창이 뜨게끔 설정
    HotButton_카푸치노.addActionListener(new ActionListener () {               
          @Override
          public void actionPerformed(ActionEvent e) {
             JButton srcBtn =(JButton)e.getSource();
              if(srcBtn==HotButton_카푸치노) {
                 int result = JOptionPane.showConfirmDialog(HotButton_카푸치노, "카푸치노를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                 if(result == JOptionPane.OK_OPTION) {
                    ordertxt.append((CoffeeSystem.hot_drink.get(1).toString()));
                    CoffeeSystem.order.add(CoffeeSystem.hot_drink.get(1));
                    CoffeeSystem.new_Price(2500);
                    
                 }
                 
              }
          }});
}
}

