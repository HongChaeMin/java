package oop_test;

public class Main {

	public static void main(String[] args) {
		
		Info in = new Info();//��ü�� ����� ����
		Info in1 = new Info();
		
		in.setData("ȫä��", 19);
		in1.setData("ȫä��", 9);
		
		in.disp();
		in1.disp();
		
		System.out.println(in.getName() + in1.getName());
		
	}

}
