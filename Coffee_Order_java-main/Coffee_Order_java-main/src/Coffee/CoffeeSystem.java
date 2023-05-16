package Coffee;
import java.awt.Image;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CoffeeSystem {

	static Vector <Menu> hot_drink = new Vector<Menu>();
	static Vector <Menu> ice_drink = new Vector<Menu>();
	static Vector <Menu> ade_drink = new Vector<Menu>();
	static Vector <Menu> dessert = new Vector<Menu>();
	static Vector <Menu> order = new Vector<Menu>();
	static Vector<Integer> price = new Vector<Integer>();
	

	
	static Menu new_Hot_Drink(String product_name,int price) {
		
		Menu new_Hot_Drink = new Menu(product_name,price);
		CoffeeSystem.addToHotDrink(new_Hot_Drink);	
		return new_Hot_Drink;
	}
	
	static Menu new_Ice_Drink(String product_name,int price) {
		
		Menu new_Ice_Drink = new Menu(product_name,price);
		CoffeeSystem.addToIceDrink(new_Ice_Drink);				
		return new_Ice_Drink;
		
	}
	
	static Menu new_Ade_Drink(String product_name,int price) {
		
		Menu new_Ade_Drink = new Menu(product_name,price);
		CoffeeSystem.addToAdeDrink(new_Ade_Drink);				
		return new_Ade_Drink;
		
	}
	
	static Menu new_Dessert(String product_name,int price) {
		
		Menu new_Dessert = new Menu(product_name,price);
		CoffeeSystem.addToDessert(new_Dessert);				
		return new_Dessert;
		
	}
	static Integer new_Price(int price) {
		
		Integer new_Price = new Integer(price);
		CoffeeSystem.addToPrice(new_Price);	
		return new_Price;
	}
	
	static  String total_Price(int sum) {
		
		sum=0;
		int m;
		for(int i=0; i<CoffeeSystem.getNumPrices(); i++) {			
			m=CoffeeSystem.getPrice(i);
			sum = sum + m;
	}
		return "     총 가격 :" + sum + "원";
	}
	
	  
	private static void addToPrice(Integer new_Price) {
		price.add(new_Price);
		
	}

	private static void addToDessert(Menu new_Dessert) {
		
		dessert.add(new_Dessert);		
	}

	private static void addToAdeDrink(Menu new_Ade_Drink) {
		ade_drink.add(new_Ade_Drink);
		
	}

	private static void addToIceDrink(Menu new_Ice_Drink) {
		ice_drink.add(new_Ice_Drink);
	}

	
	
	private static void addToHotDrink(Menu new_Hot_Drink) {
		hot_drink.add(new_Hot_Drink);
		
	}
	
	static void setupMenu() {
		CoffeeSystem.new_Hot_Drink("(Hot)아메리카노", 1500);
		CoffeeSystem.new_Hot_Drink("(Hot)카푸치노", 2500);
		CoffeeSystem.new_Ice_Drink("(ICE)아메리카노", 2000);
		CoffeeSystem.new_Ice_Drink("(ICE)카페라떼", 2500);
		CoffeeSystem.new_Ade_Drink("(ICE)레몬에이드", 3000);
		CoffeeSystem.new_Ade_Drink("자몽에이드", 3000);
		CoffeeSystem.new_Dessert("초코케이크 (1조각)", 3000);
		CoffeeSystem.new_Dessert("치즈케이크 (1조각)", 3500);		
	}
		
	@SuppressWarnings("unused")
	private static void new_Order_HotDrink(Menu new_Hot_Drink) {
		order.add(new_Hot_Drink);
	}
	
	static Menu getOrder(int witch) {
			
		return order.elementAt(witch);
	}
	static int getNumOrders() {

		return order.size();
	}
	static int getNumPrices() {
		return price.size();
	}
	static Integer getPrice(int witch) {
		return price.elementAt(witch);
	}
	static Integer get_Price(int witch) {
		return price.get(witch);
	}
	


	
}
/*이 코드는 CoffeeSystem이라는 클래스를 정의합니다.
이 클래스에는 다양한 메뉴와 주문 정보를 저장하기 위한 여러 개의 정적 벡터(hot_drink, ice_drink, ade_drink, dessert, order, price)가 있습니다.
Menu 클래스가 참조되지만 주어진 코드에서 해당 클래스의 코드는 제공되지 않았습니다.
이 클래스에는 새로운 음료와 디저트를 생성하고(new_Hot_Drink, new_Ice_Drink, new_Ade_Drink, new_Deasert) 해당 벡터에 추가하는 메서드가 있습니다.
new_Price 메서드는 새로운 가격을 생성하고 price 벡터에 추가하는 역할을 합니다.
total_Price 메서드는 price 벡터에 저장된 가격들을 합산하여 총 가격을 계산합니다.
setupMenu 메서드는 미리 정의된 음료와 디저트를 해당 벡터에 추가하여 메뉴를 초기화합니다.
주문과 가격을 검색하기 위한 도우미 메서드(getOrder, getPrice, get_Price)와 주문과 가격의 개수를 얻기 위한 메서드(getNumOrders, getNumPrices)가 있습니다.*/
 