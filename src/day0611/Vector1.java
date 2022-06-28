package day0611;

import java.util.ArrayList;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		// Vector 객체 생성방법
		Vector vc1 = new Vector();
		
		// Vector 객체에 값을 추가할 땐 어떤 타입이든 상관없다.
		vc1.add("hello");
		vc1.add(new Integer(10)); // ↓
		
		// 위의 Integer를 권장하는 방법으로 바꾼 방법 
		vc1.add(Integer.valueOf(20));
		
		System.out.println("Vector size : " + vc1.size());
		
		for (int i=0; i<vc1.size(); i++) {
			System.out.println("vc [" + i + "] : " + vc1.get(i));
			// 값을 가져오기 위해 get 사용
		}
		
		System.out.println();
	
		// Vector와 ArrayList의 차이는 크게 없다는 것을 알 수 있다.
		

			ArrayList vc2 = new ArrayList();
			
			// Vector 객체에 값을 추가할 땐 어떤 타입이든 상관없다.
			vc2.add("hello");
			vc2.add(new Integer(10));
			
			// 위의 Integer를 권장하는 방법으로 바꾼 방법 ↓
			vc2.add(Integer.valueOf(20));
			
			System.out.println("Vector size : " + vc2.size());
			
			for (int i=0; i<vc2.size(); i++) {
				System.out.println("vc [" + i + "] : " + vc2.get(i));
			}
	}
	
}
