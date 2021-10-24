package api.util.list;

import java.util.*;

public class TotalStudent {

	//리스트 생성
	private ArrayList<Student> list = new ArrayList<>();
	
	//전체 토탈 변수
	//리스트에 있는 Student객체 변수 값으로 토탈값을 구함
	private int art, ait, mat, tot;
	private double avgt;
	
	//생성자
	public TotalStudent(ArrayList<Student> list) {
		if(list == null) {
			System.out.println("추가 할 수 없습니다");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			addStudent(list.get(i));
		}
		totalSet();
	}
	//디폴트 셍성자
	public TotalStudent() {}
	
	//추가
	public void addStudent(String name, int ar, int ai, int ma) {
		list.add(new Student(name, ar, ai, ma));
		totalSet();
	}
	public void addStudent(Student s) {
		if(s == null) {
			System.out.println("추가 할 수 없습니다");
			return;
		}
		list.add(s);
		totalSet();
	}
	
	// setter
	public void totalSet() {
		// 계속 더해지지 못하게 초기화 시켜줌
		art = 0;
		ait = 0;
		mat = 0;
		tot = 0;
		avgt = 0;
		// 리스트에 저장되어 있는 모든 학생의 과목 점수를 모두 계산
		for(int i=0; i<list.size(); i++) {
			art += list.get(i).getAr(); // Student에 있는 알고리즘 점수값
			ait += list.get(i).getAi(); // 		"	      인공지능 점수값
			mat += list.get(i).getMa(); // 		"	      이산수학 점수값
		}
		this.tot = art + ait + mat;
		this.avgt = tot/list.size()/3.0; // 총계 + 사람수 + 과목수
	}
	
	// getter
	public int getArt() {
		return art;
	}
	public int getAit() {
		return ait;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return tot;
	}
	public double getAvgt() {
		return avgt;
	}
	// list 안에 있는 Student 객체를 반환
	public Student getStudent(int i) {
		return list.get(i);
	}
	
	public void totalDisp() {
		System.out.println("이름\t알고리즘\t인공지능\t이산수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		for(int i=0; i<list.size(); i++) {
			list.get(i).showData(); // list안에 있는 Student객체의 출력 메소드
		}
		System.out.println("=========================================");
		System.out.println("총계\t"+getArt()+"\t"+getAit()+"\t"+getMat()+"\t"+getTot()+"\t"+getAvgt());
	}
	
}
