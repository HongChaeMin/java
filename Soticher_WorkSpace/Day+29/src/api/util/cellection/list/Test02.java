package api.util.cellection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
	
		
//		while(true) {
//			System.out.println("도서명 : ");
//			String c = sc.next();//띄워쓰기 , 문장 엔터키 nextLine();
//			if(list.contains(c)){
//				System.out.println("이미 등록된 도서입니다");
//			}else if(c.equals("종료")) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else {
//				list.add(c);
//				System.out.println("도서 등록이 되었습니다 [현재 도서 "+list.size()+"개]");
//			}
//		}
		
		int cheak = 1;
		
		while(cheak == 1) {
			
			System.out.println("원하는 서비스 번호를 입력하세요");
			System.out.println("1. 도서 등록하기     2. 원하는 번호에 도서 등록하기     3. 등록된 도서 삭제    4. 도서 검색하기     5. 등록된 도서 목록 보기     6. 종료");
			
			switch(sc.nextInt()) {
				case 1 :
					sc.nextLine();
					System.out.print("등록할 도서 이름을 입력해주세요 : ");
					String c1 = sc.nextLine();
					if(list.contains(c1)) {
						System.out.println("이미 등록된 도서입니다");
					}else {
						list.add(c1);
						System.out.println("도서 등록이 되었습니다 [현재 도서 "+list.size()+"개]");
					}
					break;
				case 2 : 
					sc.nextLine();
					System.out.print("등록할 도서 이름을 입력해주세요 : ");
					String c = sc.nextLine();
					System.out.print("등록할 도서 번호를 입력해주세요 : ");
					int n = sc.nextInt();
					
					if(n<=list.size()) {
							list.add(n, c);
							System.out.println("도서 등록이 되었습니다 [현재 도서 "+list.size()+"개]");
					}else {
						System.out.println("도서 번호가 없습니다");
					}
					
					break;
				case 3 : 
					sc.nextLine();
					System.out.print("삭제할 도서 이름을 입력해주세요 : ");
					String r = sc.nextLine();
					list.remove(r);
					System.out.println("[현재 도서 "+list.size()+"개]");
					break;
				case 4 : 
					sc.nextLine();
					System.out.print("검색할 도서명을 입력해주세요 : ");
					String d = sc.nextLine();
					if(list.contains(d)) {
						System.out.println("["+list.indexOf(d)+"] "+d);
					}
					break;
				case 5 : 
					for(int i=0; i<list.size(); i++) {
						System.out.print("["+i+"] "+list.get(i)+", ");
					}
					System.out.println("[현재 도서 "+list.size()+"개]");
					break;
				case 6 : 
					System.out.println("시스템을 종료합니다");
					cheak++;
					break;
			}
			
		}
		
		
	}

}
