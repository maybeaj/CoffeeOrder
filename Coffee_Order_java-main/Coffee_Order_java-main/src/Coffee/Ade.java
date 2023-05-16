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
		JButton AdeButton_LemonAde = new JButton(new ImageIcon("images/레몬에이드.jpg"));
        Adepn.add(AdeButton_LemonAde);
        AdeButton_LemonAde.setBounds(20, 20, 150,270);
        //메뉴이름 띄어줄 텍스트 필드 생성
        JTextField LemonAde = new JTextField("레몬에이드  3000원"); 
        Adepn.add(LemonAde);
        LemonAde.setBounds(20,290,150,20);
        LemonAde.setEditable(false);
        AdeButton_LemonAde.addActionListener(new ActionListener () {
                 
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    JButton srcBtn =(JButton)e.getSource();
                     if(srcBtn==AdeButton_LemonAde) {
                 int result=   JOptionPane.showConfirmDialog(AdeButton_LemonAde, "레몬에이드를 주문하시겠습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
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
         JButton AdeButton_GrapeFruitAde = new JButton(new ImageIcon("images/자몽에이드.jpg"));        
         Adepn.add(AdeButton_GrapeFruitAde);
         AdeButton_GrapeFruitAde.setBounds(210, 20, 150, 270);
         //메뉴이름 띄어줄 텍스트 필드 생성
         JTextField GrapeFruitAde = new JTextField("자몽에이드  3000원"); 
         Adepn.add(GrapeFruitAde);
         GrapeFruitAde.setBounds(210,290,150,20);
         GrapeFruitAde.setEditable(false);
         AdeButton_GrapeFruitAde.addActionListener(new ActionListener () {
                  
                  @Override
                  public void actionPerformed(ActionEvent e) {
                     JButton srcBtn =(JButton)e.getSource();
                      if(srcBtn==AdeButton_GrapeFruitAde) {
                  int result=   JOptionPane.showConfirmDialog(AdeButton_GrapeFruitAde, "자몽에이드를 주문하시겠습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
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
	

