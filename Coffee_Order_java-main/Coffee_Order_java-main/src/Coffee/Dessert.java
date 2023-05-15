package Coffee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Dessert {

	public void ChocoCake(JPanel Dstpn, JTextArea ordertxt) {
		JButton DstButton_ChocoCake = new JButton(new ImageIcon("images/초코케이크.jpg"));
        Dstpn.add(DstButton_ChocoCake);
        DstButton_ChocoCake.setBounds(20, 20, 259,194);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField ChocoCake = new JTextField("초코케이크 (1조각) 3000원"); 
        Dstpn.add(ChocoCake);
        ChocoCake.setBounds(20,215,260,30);
        ChocoCake.setEditable(false);
        DstButton_ChocoCake.addActionListener(new ActionListener () {
                 
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    JButton srcBtn =(JButton)e.getSource();
                     if(srcBtn==DstButton_ChocoCake) {
                 int result=   JOptionPane.showConfirmDialog(DstButton_ChocoCake, "초코케이크를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                        if(result == JOptionPane.OK_OPTION) {
                           ordertxt.append((CoffeeSystem.deasert.get(0).toString()));
                           CoffeeSystem.order.add(CoffeeSystem.deasert.get(0));
                           CoffeeSystem.new_Price(3000);
                        }
                    
                     }
                 }
     });
	}
	
	public void CheeseCake(JPanel Dstpn, JTextArea ordertxt) {
        JButton DstButton_CheeseCake = new JButton(new ImageIcon("images/치즈케익.jpg"));
        Dstpn.add(DstButton_CheeseCake);
        DstButton_CheeseCake.setBounds(280, 20, 259,194);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField CheeseCake = new JTextField("치즈 케이크(1조각) 3500원"); 
        Dstpn.add(CheeseCake);
        CheeseCake.setBounds(280,215,260,30);
        CheeseCake.setEditable(false);
        DstButton_CheeseCake.addActionListener(new ActionListener () {
                 
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    JButton srcBtn =(JButton)e.getSource();
                     if(srcBtn==DstButton_CheeseCake) {
                 int result = JOptionPane.showConfirmDialog(DstButton_CheeseCake, "치즈케이크를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                        if(result == JOptionPane.OK_OPTION) {
                           ordertxt.append((CoffeeSystem.deasert.get(1).toString()));
                           CoffeeSystem.order.add(CoffeeSystem.deasert.get(1));
                           CoffeeSystem.new_Price(3500);
                        }
                    
                     }
                 }
     });
	}
}
