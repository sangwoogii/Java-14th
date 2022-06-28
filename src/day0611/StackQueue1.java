package day0611;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue1 {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();

		// Stack에 내용을 집어 넣을 땐 push , 값을 꺼낼 땐 pop을 사용 -> 기억
		st.push("0");
		st.push("1");
		st.push("2");
		
		// Queue에 내용을 집어 넣을 땐 offer 사용 , 값을 꺼낼 땐 poll 사용 -> 기억
		q.offer(0);
		q.offer(1);
		q.offer(2);
		
		System.out.println("Stack 출력결과 : " + st);
		
		while (!st.empty()) { // st가 비어있지 않으면 이라는 의미 (empty() 사용)
			System.out.println(st.pop());
		}
		
		System.out.println();
		
		System.out.println("Queue 출력결과 : " + q);
		
		while (!q.isEmpty()) { // q가 비어있지 않으면 이라는 의미 (Queue는 isEmpty() 사용)
			System.out.println(q.poll());
		}
		
	}

}
