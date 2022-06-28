package day0611;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	private int menu; 		// 1 ~ 7번까지의 메뉴선택을 위한 변수
	boolean flag = true;	// 현재 실행중인지에 대한 상태 (true -> 실행중 / false -> 끝)
	private String menuStr = "1.추가 | 2.검색 | 3.수정 | 4.삭제 | 5.전체출력 | 6.데이터초기화 | 7.종료 > ";
	
	// menu값에 따라서 추가, 검색 등을 수행하는 메서드
	public void menuProcess(ArrayList<Member1> data) {
		
		int idx = 0; // 메서드 안에서 쓰는 변수는 지역변수, 지역변수는 무조건 초기값필요
		
		while (flag) {
			System.out.print(menuStr);
			menu = sc.nextInt();
			switch (menu) {
			case 1: // 추가
				data.add(infoInput());
				break;
			case 2: // 검색
				idx = search(data);
				if (idx >= 0) {
					printMember(data.get(idx));
				}
				break;
			case 3: // 수정
				editMember(data);
				break;
			case 4 : // 삭제
				delMember(data);
				break;
			case 5: // 전체출력
				for (int i=0; i<data.size(); i++) {
					printMember(data.get(i));
				}
				break;
			case 6: // 데이터초기화
				data.removeAll(data);
				break;
			case 7: // 종료
				System.out.println("종료 합니다.");
				flag = false;
				break;
			default: // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	// 추가 기능을 수행하는 메서드 -> 1번에 해당
	public Member1 infoInput() { // Member를 리턴값으로 가지는 메서드
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		System.out.print("전화번호 > ");
		String tel = sc.nextLine();
		
		System.out.print("주소 > ");
		String address = sc.nextLine();
		
		return new Member1(name, tel, address);
		// 객체 생성한 값을 리턴값으로 받음
	}
	
	// 검색하는 메서드 -> 2번에 해당
	// 이름을 입력받아 리스트에서 해당 이름의 위치를 찾아서 반환시킬 것임
	public int search(ArrayList<Member1> data) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = sc.nextLine();
		
		for (int i=0; i<data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				return i;
			}
		}
		
		System.out.println("일치하는 사람이 없습니다.");
		return -1;
	}
	
	
	// 수정을 처리하는 메서드 -> 3번에 해당
	public void editMember(ArrayList<Member1> data) {
		Scanner sc = new Scanner(System.in);
		
		int idx = search(data); // 인덱스를 찾는 것
		
		if (idx != -1) {
			System.out.print("새로운 전화번호 : ");
			String newTel = sc.nextLine();
			
			System.out.print("새로운 주소 : ");
			String newAddress = sc.nextLine();
			
			data.set(idx, new Member1(data.get(idx).getName(), newTel, newAddress));
		}
	}
	
	
	// 삭제를 처리하는 메서드 -> 4번에 해당
	public void delMember(ArrayList<Member1> data) {
		Scanner sc = new Scanner(System.in);
		
		int idx = search(data);
		
		if (idx != -1) {
			data.remove(idx);
		}
		
	}
	
	
	// 결과를 전체 출력하는 메서드 -> 5번에 해당
	public void printMember(Member1 m) {
		System.out.println(m);
	}
}
