package day0611;

import java.util.List;
import java.util.Vector;

class Board {
	String subject;
	String content;
	String id;
	
	public Board() {}
	
	public Board(String subject, String content, String id) {
		this.subject = subject;
		this.content = content;
		this.id = id;
	}

}

public class Vector2 {

	public static void main(String[] args) {
		
		// Vector는 List의 자식
		List<Board> list = new Vector<Board>();
		

		// add를 사용하고 값을 추가할 땐 new 키워드 사용
		// new 키워드는 제네릭의 타입으로 사용한다.
		list.add(new Board("제목 1", "내용 1", "작성자 1"));
		list.add(new Board("제목 2", "내용 2", "작성자 2"));
		list.add(new Board("제목 3", "내용 3", "작성자 3"));
		list.add(new Board("제목 4", "내용 4", "작성자 4"));
		list.add(new Board("제목 5", "내용 5", "작성자 5"));
		
		list.remove(1); // 작성자 2번이 쓴 글이 삭제 -> 인덱스는 0번째부터 시작
		
		for (int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.subject + "\t" + b.content + "\t" + b.id);
		}
		
		
		
		
	}

	

}
