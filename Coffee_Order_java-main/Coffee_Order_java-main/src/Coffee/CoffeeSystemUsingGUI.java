package Coffee;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import Coffee.Hot;

public class CoffeeSystemUsingGUI {

   // JPanel속성을 상속받은 이미지 패널 설정, 이미지를 그리는 도구 
   @SuppressWarnings("serial")
   static class ImagePanel extends JPanel{
      // 1번방식: img를 먼저 선언하고 아래에 경로 써주기
      private Image img;      
      // 2번방식: img를 선언하고 경로도 한번에 같이 써주기
      private Image manual_img = new ImageIcon("../images/사용설명서.jpg").getImage();//지움
      
      public ImagePanel (Image img) {
         this.img = img; 
         
      }
      
      //그리기 도구 배경화면, 사용서 이미지 그리기
      public void paintComponent (Graphics g) {
         g.drawImage(img, 0,0,600,800,null);
         
      }
   }

   public static void main(String[] args) {
      JFrame fr = new JFrame("커피시스템");
        // 이미지 패널 그리기
        ImagePanel pn =new ImagePanel(new ImageIcon("images/Back.jpg").getImage());
        fr.pack();
        fr.add(pn);       
        JPanel Hotpn = new JPanel();
        JPanel Icepn = new JPanel();
        JPanel Adepn = new JPanel();
        JPanel Dstpn = new JPanel(); // 디저트 메뉴를 띄우는 패널
        JPanel Orderpn = new JPanel();
        Hot hot = new Hot();// Hot 클래스 생성
        Ice ice = new Ice();
        Ade ade = new Ade();
        Dessert dst = new Dessert();
        Order order = new Order();
       
      
        //주문내역
        JTextArea ordertxt = new JTextArea(); 
      
        
        //주문내역을 확인할수있는 텍스트 필드를 붙이고, 내용추가
         pn.add(ordertxt);  
         ordertxt.append("\n                                                  장바구니\n\n");
         ordertxt.setBounds(0, 600, 400, 200); // 주문한내역을 볼수있는 txtarea를 생성       
         ordertxt.setFont(new Font("G마켓 산스 TTF Medium",Font.BOLD,12));

        
        //모든주문리스트그거인듯-order누르면나오는거
        JTextArea listtxt = new JTextArea();
        listtxt.setBounds(0, 100, 600, 550);
        listtxt.setFont(new Font("G마켓 산스 TTF Light",Font.BOLD,20));
        
        JButton[] bt = new JButton[5];
              
        //버튼들 위치와 크기 설정
        int width[]= {100,100,100,200,100};
        int height[]= {50,50,50,50,50};
        int x[] = {50,150,250,350,440};
        int y[] = {25,25,25,25,680};
        
        //이미지 패널 크기설정
        pn.setLayout(null);
        pn.setBounds(0,0,600,400);
        // 팔 메뉴들 Vector 객체속에 미리 저장해놓기
        CoffeeSystem.setupMenu(); 
       
        //메인 버튼 5개 설정
        bt[0] = new JButton("HOT"); 
        bt[1] = new JButton("ICE"); 
        bt[2] = new JButton("ADE");
        bt[3] = new JButton("DESSERT");
        bt[4] = new JButton("Order");
                
        for (int i = 0; i < bt.length; i++) {
            pn.add(bt[i]);
            bt[i].setBounds(x[i], y[i], width[i], height[i]);
            // 폰트 설정
            bt[i].setFont(new Font("Impact 보통", Font.BOLD, 24));
            //버튼을 투명하게 만들고, 버튼글씨 색상 설정
            bt[i].setContentAreaFilled(false);
            bt[i].setBorderPainted(false);
            bt[i].setFocusPainted(false);
            bt[i].setForeground(Color.WHITE);
        }
        
        //버튼 0번의 기능설정
        bt[0].addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				  bt[0] =(JButton)e.getSource();
	                	fr.add(Hotpn);                	
	                	Hotpn.setLayout(null);
	                    Hotpn.setBounds(0, 100, 600, 550);
	                    Hotpn.setBackground(Color.white);       
	                 
	                    Hotpn.setVisible(true);//
	                    hot.HotAmericano(Hotpn, ordertxt);
	                    hot.HotCappucino(Hotpn, ordertxt);
                        //hotpn 누를시, 나머지 패널을 보이지 않게하기
	                    Hotpn.setVisible(true);
	                    Icepn.setVisible(false);
	                    Adepn.setVisible(false);
	                    Dstpn.setVisible(false);
	                    Orderpn.setVisible(false);
	                    ordertxt.setVisible(true);
	      
	     }
    }
     );

        //bt[0] 과 같은 형식임.
        bt[1].addActionListener(new ActionListener () {
           
            @Override
            public void actionPerformed(ActionEvent e) {
               bt[0] =(JButton)e.getSource();
               fr.add(Icepn);
                    
                Icepn.setLayout(null);
                Icepn.setBounds(0, 100, 600, 550);
                Icepn.setBackground(Color.white);
                ice.IceAmericano(Icepn, ordertxt);
                ice.IceCaffeLatte(Icepn, ordertxt);
                
                   Hotpn.setVisible(false);
                   Icepn.setVisible(true);
                   Adepn.setVisible(false);
                   Dstpn.setVisible(false);
                   Orderpn.setVisible(false);
                   ordertxt.setVisible(true);
         
            }       
    }        
     );
        
        bt[2].addActionListener(new ActionListener () {

         @Override
         public void actionPerformed(ActionEvent e) {
            JButton srcBtn = (JButton)e.getSource();
            if(srcBtn==bt[2]) {
               fr.add(Adepn);
               
               Adepn.setLayout(null);
               Adepn.setBounds(0, 100, 600, 550);
               Adepn.setBackground(Color.white);     
               ade.LemonAde(Adepn, ordertxt);
               ade.GrapeFruitAde(Adepn, ordertxt);
               
               
                   Hotpn.setVisible(false);
                   Icepn.setVisible(false);      
                   Adepn.setVisible(true);
                   Dstpn.setVisible(false);
                   Orderpn.setVisible(false);
                   ordertxt.setVisible(true);
   
            }
         }       
           
        }); 
        
        bt[3].addActionListener(new ActionListener () {

         @Override
         public void actionPerformed(ActionEvent e) {
            bt[3] = (JButton)e.getSource();
            
               fr.add(Dstpn);
               Dstpn.setLayout(null);
               Dstpn.setBounds(0, 100, 600, 550);
               Dstpn.setBackground(Color.white);
               dst.ChocoCake(Dstpn, ordertxt);
               dst.CheeseCake(Dstpn, ordertxt);
               
               
                   Hotpn.setVisible(false);
                   Icepn.setVisible(false);      
                   Adepn.setVisible(false);
                   Dstpn.setVisible(true);
                   Orderpn.setVisible(false);
                   ordertxt.setVisible(true);
                               
         }
           
        });
    
        
        // 주문리스트 버튼 기능 (주문담기버튼이랑 order기능 합침)
        bt[4].addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            bt[4] =(JButton)e.getSource();
             
            	int result=JOptionPane.showConfirmDialog(bt[4], "주문하시겠습니까?", "주문확인",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.OK_OPTION) {
                                  
                   order.Customer_Order(listtxt);   
                   ordertxt.setText("");
                   int sum = 0;
                   listtxt.append(CoffeeSystem.total_Price(sum));
                   
                   
               fr.add(Orderpn);
               Orderpn.add(listtxt);
               Orderpn.setBounds(0, 100, 600, 550);
               Orderpn.setBackground(Color.white);
               
                   Hotpn.setVisible(false);
                   Icepn.setVisible(false);      
                   Adepn.setVisible(false);
                   Dstpn.setVisible(false);
                   Orderpn.setVisible(true);
                   ordertxt.setVisible(false);
                       
            }           
        }
        
        
        });
                     
        //첫 화면에는 주문기능 보이지 않게하기
        ordertxt.setVisible(false);
         
        //프레임 설정
        fr.setLocation(200,10);
        fr.setContentPane(pn);
        fr.setSize(600, 800);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
   }
