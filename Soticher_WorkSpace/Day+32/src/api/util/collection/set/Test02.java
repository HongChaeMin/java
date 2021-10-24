package api.util.collection.set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		//		[도서 등록 프로그램 구현]
		//		사용자에게 계속해서 도서명을 입력받아 저장하는 저장소를 구현하려고 합니다
		//		이미 등록된 책이면 등록이 거절되었으면 합니다
		//		(예상 결과)	
		//		도서명 : 어린 왕자
		//		도서 등록이 되었습니다... 현재 도서 1개
		//		도서명 : 키다리 아저씨
		//		도서 등록이 되었습니다... 현재 도서 2개
		//		도서명 : 어린 왕자
		//		이미 등록된 도서입니다.
		//		도서명 : 종료
		//		프로그램을 종료합니다.
		
		Set<String> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		Iterator<String> it = null;
		boolean check = true;
		String name = null;
		
		while(true) {
			System.out.println("사용할 메뉴 번호를 입력하세요\n1. 도서등록  2. 도서삭제  3. 도서보기  4. 종료");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("도서명을 입력해주세요 : ");
				name = sc.next();
				for(String in : set) {
					if(in.equals(name)) {
						System.out.println("도서명이 존재합니다");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(name);
					System.out.println("도서 등록이 완료되었습니다");
				}
				break;
			case 2: 
				System.out.print("삭제할 도서명을 입력해주세요 : ");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					if(it.next().equals(name)) {
						it.remove();
						System.out.println("삭제가 완료되었습니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("도서명이 존재하지 않습니다");
				}
				break;
			case 3:
				it = set.iterator();
				for(String nam : set) {
					System.out.println("도서 : "+nam);
				}
				break;
			}
		}
		
	}

}
