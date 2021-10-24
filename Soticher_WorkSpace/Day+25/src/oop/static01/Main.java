package oop.static01;

public class Main {
	
	public static void main(String[] args) {

		Student st1 = new Student ("장동건", 100, 100, 100);
		Student st2 = new Student ("원빈", 98, 78, 100);
		Student st3 = new Student ("김태희", 28, 78, 30);
		Student st4 = new Student ("한가인", 100, 92, 82);

		System.out.println("이름\t알고리즘\t인공지능\t이산수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");

		st1.showData();
		st2.showData();
		st3.showData();
		st4.showData();
		
		System.out.println("=============================================================");
		
		Student.showTotal();
		
	}

}
