package Coffee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ade {
	
	public void LemonAde(JPanel Adepn,JTextArea ordertxt) {
		JButton AdeButton_레몬에이드 = new JButton(new ImageIcon("../images/레몬에이드.JFIF"));
        Adepn.add(AdeButton_레몬에이드);
        AdeButton_레몬에이드.setBounds(20, 20, 259,194);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField 레몬에이드 = new JTextField("레몬에이드  3000원"); 
        Adepn.add(레몬에이드);
        레몬에이드.setBounds(20,215,260,30);
        레몬에이드.setEditable(false);
        AdeButton_레몬에이드.addActionListener(new ActionListener () {
                 
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    JButton srcBtn =(JButton)e.getSource();
                     if(srcBtn==AdeButton_레몬에이드) {
                 int result=   JOptionPane.showConfirmDialog(AdeButton_레몬에이드, "레몬에이드를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                        if(result == JOptionPane.OK_OPTION) {
                           ordertxt.append((CoffeeSystem.ade_drink.get(0).toString()));
                           CoffeeSystem.order.add(CoffeeSystem.ade_drink.get(0));
                           CoffeeSystem.new_Price(3000);
                        }
                     }
                 }
     });
	}
	
	public void GrapeFruitAde(JPanel Adepn, JTextArea ordertxt) {
		 ImageIcon icon_자몽에이드 = new ImageIcon("../images/자몽에이드.JPG");
         JButton AdeButton_자몽에이드 = new JButton(CoffeeSystem.resizeIcon(icon_자몽에이드, 260, 195));
         
         Adepn.add(AdeButton_자몽에이드);
         AdeButton_자몽에이드.setBounds(280, 20, 259,194);
         //메뉴이름 띄어줄 텍스트 필드 생성
         JTextField 자몽에이드 = new JTextField("자몽에이드  3000원"); 
         Adepn.add(자몽에이드);
         자몽에이드.setBounds(280,215,260,30);
         자몽에이드.setEditable(false);
         AdeButton_자몽에이드.addActionListener(new ActionListener () {
                  
                  @Override
                  public void actionPerformed(ActionEvent e) {
                     JButton srcBtn =(JButton)e.getSource();
                      if(srcBtn==AdeButton_자몽에이드) {
                  int result=   JOptionPane.showConfirmDialog(AdeButton_자몽에이드, "자몽에이드를 주문하시겟습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
                         if(result == JOptionPane.OK_OPTION) {
                            ordertxt.append((CoffeeSystem.ade_drink.get(1).toString()));
                            CoffeeSystem.order.add(CoffeeSystem.ade_drink.get(1));
                            CoffeeSystem.new_Price(3000);
                         }
                      }
                  }
      });
     };
		
	}
	

