package day0611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exam2 {

	public static void main(String[] args) {
	
		// 만들어져있는 로또 만들기
		// ArrayList, Collections 등 이런 것들은 이미 만들어져 있기 때문
		
		// 객체 타입이기 때문에 기본형이 아닌 래퍼클래스의 형태로 와야한다. <Integer>
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i=1; i<=45; i++) {
			lotto.add(i);
			// 1 ~ 45까지의 숫자를 lotto에 추가
			// lotto는 ArrayList 타입이기 때문에 add 사용
		}
		
		// Collections는 List, Set의 부모이기 때문에
		// 부모 클래스는 객체 생성없이 자식 클래스를 사용 가능함
		// 부모 클래스 : Collections / 자식 클래스 : ArrayList
		// shuffle() : Collections 객체에서 사용할 수 있는 무작위라는 뜻의 하나의 코드
		// lotto에 대한 값을 섞는다 라는 의미
		Collections.shuffle(lotto);
		
		// 로또 번호 6자리 숫자를 담을 배열 선언
		int [] lottoArr = new int [6];
		
		for (int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = lotto.remove(0);
			// 1 ~ 45까지의 숫자 중 같은 숫자가 나오면 안되기 때문에
			// remove를 0번째 즉, 첫번째 오는 숫자를 lottoArr 배열의 숫자에 담아
			// 첫번째로 오는 숫자들을 출력하고 삭제한, 그 값을 lottoArr의 i번째 값에 넣는다.
		}
		
		
		String lottoNumStr = Arrays.toString(lottoArr);
		// Arrays.toString -> 배열의 값을 출력하기 위한 메서드, String 타입만 가능
		System.out.println("로또 번호 : " + lottoNumStr);

	}

}
