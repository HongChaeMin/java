package api.util.list;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TotalStudent ts = new TotalStudent();
		
		//객체 안에 직접 리스트를 추가
		System.out.print("입력할 학생 수를 입력해주세요 : ");
		int su = sc.nextInt();
		
		for(int i=0; i<su; i++) {
			System.out.print("이름 : "); String name = sc.next();
			System.out.print("알고리즘 점수 : "); int ar = sc.nextInt();
			System.out.print("인공지능 점수 : "); int ai = sc.nextInt();
			System.out.print("이산수학 점수 : "); int ma = sc.nextInt();
			ts.addStudent(name, ar, ai, ma);
		}
		
		ts.totalDisp();
		
		System.out.println();
		
		//객체 자체를 리스트에 추가
		ts.addStudent(new Student("홍채민", 100, 100, 100));
		
		ts.totalDisp();
		
		System.out.println();
		
		//리스트를 객체 안에 추가
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student("남도일", 99, 43, 56));
		st.add(new Student("코난", 34, 65, 90));
		
		TotalStudent st1 = new TotalStudent(st);
		
		st1.totalDisp();
		
	}
	
}
