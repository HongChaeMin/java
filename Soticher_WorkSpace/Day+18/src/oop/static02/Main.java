package oop.static02;

public class Main {

	public static void main(String[] args) {
		
		Info in1 = new Info("�Ƿη�", 19);
		Info in2 = new Info("ũ��", 19);
		Info in3 = new Info("����", 19);
		
		in1.disp();
		in2.disp();
		in3.disp();
		
		
		System.out.println("�� �л��� �� : "+Info.getSu()+"��");
		
	}

}
