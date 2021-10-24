package oop.static02;

public class Info {

	private String name;
	private int age;
//	private int math;
//	private int ko;
//	private int eg;
	private static int su;
//	private static double p;
	
	public Info(String name, int age) {
		if(age < 0) {
			System.out.println("잘못 입력하셨습니다");
			return ;
		}
		this.name = name;
		this.age = age;
//		this.math = math;
//		this.ko = ko;
//		this.eg = eg;
		Info.su++;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void setSu(int su) {
		Info.su = su;
	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	public void setKo(int ko) {
//		this.ko = ko;
//	}
//	public void setEg(int eg) {
//		this.eg = eg;
//	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static int getSu() {
		return su;
	}
	
	public void disp() {
		System.out.println("이름 : "+getName()+", 나이 : "+getAge()+"살");
	}
	
}
