package Coffee;

import java.awt.Font;

import javax.swing.JTextArea;

public class Order {
	 public void Customer_Order(JTextArea listtxt) {
         
         Menu m;                           
         listtxt.append("---------------------Order List-------------------------\n\n\n\n");
               
         // 모든 주문리스트를 불러옴
         for(int i=0; i<CoffeeSystem.getNumOrders(); i++) {
            m=CoffeeSystem.getOrder(i);
            listtxt.append(i+1+". ");
            listtxt.append(m.toString());
                        
   }
         
         listtxt.append("\n-----------------------------------------------------------------\n");
   }
  
    
}
