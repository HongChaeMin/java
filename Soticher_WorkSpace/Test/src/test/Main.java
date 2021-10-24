package test;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		FileIo file = new FileIo();
		
		boolean check = true;
		
		while(check) {
			System.out.println("사용할 사용사 선택 또는 종료");
			System.out.println("1. 코난\t2. 남도일\t3. 보기\t4. 종료");
			int n = sc.nextInt();
			if(n == 1) {
				User1 u1 = new User1();
			}else if(n == 2){
				User2 u2 = new User2();
			}else if(n == 3) {
				List<String> list = file.fileInput();
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
				}
			}else if(n == 4) {
				System.out.println("종료합니다");
				check = false;
			}
		}
		
		sc.close();
		
	}

}
