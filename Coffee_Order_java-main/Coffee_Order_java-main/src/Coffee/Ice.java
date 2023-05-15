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
		JButton IceButton_IceAmericano = new JButton("");                        
        IceButton_IceAmericano.setIcon(new ImageIcon("images/아아.jpg"));
        Icepn.add(IceButton_IceAmericano);
        IceButton_IceAmericano.setBounds(20, 20, 150, 270);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField Ice_IceAmericano = new JTextField("(ICE)아메리카노  2000원"); 
        Icepn.add(Ice_IceAmericano);
        Ice_IceAmericano.setBounds(20,290,150,20);
        Ice_IceAmericano.setEditable(false);
        //버튼 기능 추가
        IceButton_IceAmericano.addActionListener(new ActionListener () {
              
              @Override
              public void actionPerformed(ActionEvent e) {
                 JButton srcBtn =(JButton)e.getSource();
                  if(srcBtn==IceButton_IceAmericano) {
                     int result = JOptionPane.showConfirmDialog(IceButton_IceAmericano, "아이스아메리카노를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                     if(result == JOptionPane.OK_OPTION) {
                        ordertxt.append((CoffeeSystem.ice_drink.get(0).toString()));
                        CoffeeSystem.order.add(CoffeeSystem.ice_drink.get(0));
                        CoffeeSystem.new_Price(2000);
                     }
                     
                  }
              }});         
	}
	
	public void IceCaffeLatte(JPanel Icepn, JTextArea ordertxt){
		
		JButton IceButton_IceCaffeLatte = new JButton("");                        
        IceButton_IceCaffeLatte.setIcon(new ImageIcon("images/아카.jpg"));           
        Icepn.add(IceButton_IceCaffeLatte);
        IceButton_IceCaffeLatte.setBounds(210, 20, 150, 270);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField Ice_IceCaffeLatte = new JTextField("(ICE)카페라떼  2500원"); 
        Icepn.add(Ice_IceCaffeLatte);
        Ice_IceCaffeLatte.setBounds(210,290,150,20);
        Ice_IceCaffeLatte.setEditable(false);
        //버튼 기능 추가
        IceButton_IceCaffeLatte.addActionListener(new ActionListener () {
              
              @Override
              public void actionPerformed(ActionEvent e) {
                 JButton srcBtn =(JButton)e.getSource();
                  if(srcBtn==IceButton_IceCaffeLatte) {
                     int result = JOptionPane.showConfirmDialog(IceButton_IceCaffeLatte, "아이스 카페라떼를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                     if(result == JOptionPane.OK_OPTION) {
                        ordertxt.append((CoffeeSystem.ice_drink.get(1).toString()));
                        CoffeeSystem.order.add(CoffeeSystem.ice_drink.get(1));
                        CoffeeSystem.new_Price(2500);
                     }
                     
                  }
              }});
		
	}
}
