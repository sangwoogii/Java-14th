package day0611;

import java.util.ArrayList;

class Item {
	
	// 클래스에 private으로 선언된 변수가 있으면 게터, 세터가 필요함
	private String name;
	private int price;
	
	public Item () {}

	public Item (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override 
	public String toString() {

		return String.format("Item { name : %s, price : %d }", name, price);
//		return "Item { name : " + name + " price : " + price + " }\n";
	}
}



public class Exam1 {
	public static void main(String[] args) {
		
		// Item 객체(이름, 가격)를 생성하고 이를 이용하여 장바구니 만들기
		// 장바구니 품목
		// 이름			 가격
		// 티셔츠			49900
		// 면바지			58900
		// 스니커즈		46900
		
		// 출력 결과
		// Item { name : 스프라이트 셔츠, price : 49900 }
		// Item { name : 슬림 면바지, price : 58900 }
		// Item { name : 스니커즈, price : 46900 }
		// ===========================================
		// 총합 : 155700원
		
		
		// Item이라는 클래스를 이용하여 각각 객체를 생성함
		Item tShirt = new Item("스프라이트 셔츠", 49900);
		Item pants = new Item("슬림 면바지", 58900);
		Item sneakers = new Item("스니커즈", 46900);
		
		int sum = 0;	// 총 합계를 나타낼 변수 선언
		
		// ArrayList에 Item 타입의 값을 cart라는 참조변수에 저장할 수 있다는 의미
		ArrayList<Item> cart = new ArrayList<Item>();
		
		cart.add(tShirt); // ArrayList의 cart라는 참조 변수에 Item 객체의 참조변수 tShirt의 값을 추가
		cart.add(pants); // ArrayList의 cart라는 참조 변수에 Item 객체의 참조변수 tShirt의 값을 추가
		cart.add(sneakers); // ArrayList의 cart라는 참조 변수에 Item 객체의 참조변수 tShirt의 값을 추가
		
		
		// 합계 및 출력하기
		// 출력할 땐 for문 사용
		
		for (int i=0; i<cart.size(); i++) {
			Item item = cart.get(i);
			// toString()을 오버라이딩 해야 주소값이 아닌 결과 값이 나옴
			System.out.println(item.toString());
			sum += item.getPrice();	// 합계를 나타내는 코드
		}
		System.out.println("=========================================");
		System.out.printf("총 합계 : %d원", sum);
	}
}
