package day0611;

import java.util.ArrayList;

public class MemberMain {
	public static void main(String[] args) {
		
		// ArrayList를 Member 타입으로 저장한다는 코드 (제네릭)
		ArrayList<Member1> data = new ArrayList<Member1>();
		MemberMenu mm = new MemberMenu(); // MemberMenu 객체 생성
		mm.menuProcess(data);
	}

}
