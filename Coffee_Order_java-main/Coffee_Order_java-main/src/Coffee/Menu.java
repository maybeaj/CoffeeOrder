package Coffee;
public class Menu {

	String product_name;
	int price;
	
	public Menu() {
		
	}
	
	public  Menu(String product_name,int price) {
		this.product_name = product_name;
		this.price = price;
	}
	
	public Menu(int price) {
		this.price=price;
	}
	
	public String toString() {
		
		return "   " +product_name+ "  " + price+"원 \n\n";
	}
	
	public void output() {
		System.out.println(toString());
	}
	
}
/*위의 코드는 Coffee 패키지에 속하는 Menu 클래스를 정의하고 있습니다. 이 클래스는 메뉴 항목의 이름과 가격을 저장하는 역할을 합니다.

주요 구성 요소:

product_name (제품 이름)과 price (가격)은 클래스의 멤버 변수로 선언되어 있습니다.
클래스에는 기본 생성자 Menu()와 매개변수를 받는 생성자 Menu(String product_name, int price) 그리고 Menu(int price)가 정의되어 있습니다.
toString() 메서드는 제품 이름과 가격을 포함한 문자열을 반환합니다.
output() 메서드는 toString()을 호출하여 결과를 출력합니다.
위의 코드는 주로 커피 메뉴를 관리하고 출력하는 용도로 사용될 수 있습니다.*/


