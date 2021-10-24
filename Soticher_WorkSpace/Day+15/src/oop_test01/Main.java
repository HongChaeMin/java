package oop_test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Player py = new Player("뽀로로", 10, 100);
		Player py2 = new Player("타요", 15, 80);
		
		py.disp();
		py2.disp();
		
		System.out.println();
		
		//String은 또 다른 객체이므로 다른 대상과 비교를 할 때에 
		//변수이름.equals(비교할 대상)
		//이렇게 해야됨
		
		int check = 1;
		
		while (check == 1) {			
			System.out.println("공격하시겠습니까?\n1.예\t2.아니요");
			check = sc.nextInt();
			
			if(check == 1) {
				System.out.print("공격할 대상을 입력해주세요 : ");
				String id = sc.next();
	
				if(id.equals(py2.getId())) {
					System.out.print(py2.getId()+"를 공격할 횟수를 입력해주세요 : ");
					int n = sc.nextInt();
					py.target(py2, n);		
				}else if(id.equals(py.getId())) {
					System.out.print(py.getId()+"를 공격할 횟수를 입력해주세요 : ");
					int m = sc.nextInt();
					py2.target(py, m);
				}else {
					System.out.println("목표를 잘못 입력하셨습니다");
				}
			}
			else {
				System.out.println("종료합니다");
				check = 2;
			}
			
		}
		
		/*System.out.println();
		
		py.attack(py2);
		py.attack(py2);
		py2.attack(py);
		py2.attack(py);
		
		py.disp();
		py2.disp();*/
		
	}

}
