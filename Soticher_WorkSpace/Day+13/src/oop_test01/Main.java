package oop_test01;

public class Main {

	public static void main(String[] args) {
		
		Player p1 = new Player("공유");
		Player p2 = new Player("아이유");
		Player p3 = new Player("유인나");		
		
		p1.disp();
		p1.setLv(20);
		p1.disp();
		p1.levUp();
		p1.disp();
		
		System.out.println();
		
		p2.disp();
		p2.setLv(15);
		p2.disp();
		
		System.out.println();
		
		p3.disp();
		p3.setLv(30);
		p3.disp();
		
		System.out.println();
		
		p3.setLv(0);
		p3.disp();
	}

}
