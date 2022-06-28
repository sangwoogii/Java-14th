package day0611;

import java.util.Stack;

class Coin {
	// 클래스에 private으로 선언된 변수가 있으면 게터, 세터가 필요함
	private int value;
	
	public Coin () {}
	
	public Coin (int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 100원, 50원, 500원, 10원짜리 순서대로 값 넣기
		// Stack형이기 때문에 값을 추가할 땐 push 사용
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// peek() : stack()의 맨 위에 저장된 객체를 반환시킴
		// pop() 과 달리 stack()에서 객체를 꺼내지 않고 확인만 하는 것.
		System.out.println(coinBox.peek().getValue());
		
		// coinBox에 있는 동전 출력하기
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}
		
		// coinBox의 값이 비어있지 않다면 반복해라
		// coinBox의 값을 꺼낸 값을 Coin 클래스의 참조변수 coin에 넣고
		// 값을 출력하기 위해선 아까 값을 저장했던 참조변수 coin의 값을 불러오기 위해
		// getValue()를 사용
		
		// 값을 가져오기 위해선 get을 사용 !

	}

}
