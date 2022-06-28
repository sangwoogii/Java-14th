package day0611;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;
		
		// 현재 시간이 밀리초 단위로 계산 -> System.currentTimeMillis();
		// ArrayList에 해당하는 내용
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
			// i에서 출력된 값이 String 형태로 바껴서 list1에 저장됨
			// String 형태로 바꾸게 하기 위해선 String.valueOf() 사용
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList 소요시간 : " + (endTime - startTime) + "ms");
		
		// LinkedList에 해당하는 내용
		startTime = System.currentTimeMillis();
	
		for (int i=0; i<10000; i++) {
			list2.add(String.valueOf(i));
			// i에서 출력된 값이 String 형태로 바껴서 list2에 저장됨
			// String 형태로 바꾸게 하기 위해선 String.valueOf() 사용
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("LinkedList 소요시간 : " + (endTime - startTime) + "ms");
		
		
		//	구분				 순차적으로		  	  중간에			   검색
		//					추가 / 삭제			추가 / 삭제
		// ArrayList		   빠름				   느림		       빠름
		// LinkedList		   느림				   빠름			   느림
	}

}
