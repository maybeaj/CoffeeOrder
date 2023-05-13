package Coffee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ice {

	public void IceAmericano(JPanel Icepn, JTextArea ordertxt){
		JButton IceButton_아이스아메리카노 = new JButton("");                        
        IceButton_아이스아메리카노.setIcon(new ImageIcon("../images/(ICE)아메리카노.JFIF"));
        Icepn.add(IceButton_아이스아메리카노);
        IceButton_아이스아메리카노.setBounds(20, 20, 259,194);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField Ice_아메리카노 = new JTextField("(ICE)아메리카노  2000원"); 
        Icepn.add(Ice_아메리카노);
        Ice_아메리카노.setBounds(20,215,260,30);
        Ice_아메리카노.setEditable(false);
        //버튼 기능 추가
        IceButton_아이스아메리카노.addActionListener(new ActionListener () {
              
              @Override
              public void actionPerformed(ActionEvent e) {
                 JButton srcBtn =(JButton)e.getSource();
                  if(srcBtn==IceButton_아이스아메리카노) {
                     int result = JOptionPane.showConfirmDialog(IceButton_아이스아메리카노, "아이스아메리카노를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                     if(result == JOptionPane.OK_OPTION) {
                        ordertxt.append((CoffeeSystem.ice_drink.get(0).toString()));
                        CoffeeSystem.order.add(CoffeeSystem.ice_drink.get(0));
                        CoffeeSystem.new_Price(2000);
                     }
                     
                  }
              }});         
	}
	
	public void IceCaffeLatte(JPanel Icepn, JTextArea ordertxt){
		
	    ImageIcon icon_아이스카페라떼 = new ImageIcon("../images/아이스카페라떼.jpg");                  
        JButton IceButton_아이스카페라떼 = new JButton(CoffeeSystem.resizeIcon(icon_아이스카페라떼, 259, 194));            
        Icepn.add(IceButton_아이스카페라떼);
        IceButton_아이스카페라떼.setBounds(280, 20, 259,194);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField Ice_아이스카페라떼 = new JTextField("(ICE)카페라떼  2500원"); 
        Icepn.add(Ice_아이스카페라떼);
        Ice_아이스카페라떼.setBounds(280,215,260,30);
        Ice_아이스카페라떼.setEditable(false);
        //버튼 기능 추가
        IceButton_아이스카페라떼.addActionListener(new ActionListener () {
              
              @Override
              public void actionPerformed(ActionEvent e) {
                 JButton srcBtn =(JButton)e.getSource();
                  if(srcBtn==IceButton_아이스카페라떼) {
                     int result = JOptionPane.showConfirmDialog(IceButton_아이스카페라떼, "아이스 카페라떼를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                     if(result == JOptionPane.OK_OPTION) {
                        ordertxt.append((CoffeeSystem.ice_drink.get(1).toString()));
                        CoffeeSystem.order.add(CoffeeSystem.ice_drink.get(1));
                        CoffeeSystem.new_Price(2500);
                     }
                     
                  }
              }});
		
	}
}
