package api.util.collection.set;

import java.util.*;

public class Test01 {

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
		
		Set<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String book = null;
			boolean check = true;
			Iterator<String> it = null;
			
			System.out.print("1.도서등록 2.도서삭제 3.도서보기 4.종료\n입력 :");
			int num = sc.nextInt();
			sc.nextLine();
			if(num==1) {
				System.out.print("책 입력 :");
				book = sc.nextLine();
				
				for(String bk : set) {
					if(bk.equals(book)) {
						System.out.println("같은 책이 존재합니다");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(book);
				}
			}else if(num==2) {
				System.out.print("책 입력 :");
				book = sc.nextLine();
				it = set.iterator();
				
				while(it.hasNext()) {//다음 데이터가있는지 확인
					String bk = it.next();//it에 있던 String book 이름을 한개가져온다
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"책이 삭제되었습니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("책 이름을 찾지 못했습니다");
				}
					
			}else if(num==3) {
				for(String bk : set) {
					System.out.println(bk);
				}
			}
			else if(num==4) {
				System.out.println("종료합니다");
				break;
			}
			
		}

	}

}
