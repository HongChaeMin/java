package oop.static01;

public class Main {
	
	public static void main(String[] args) {

		Student st1 = new Student ("�嵿��", 100, 100, 100);
		Student st2 = new Student ("����", 98, 78, 100);
		Student st3 = new Student ("������", 28, 78, 30);
		Student st4 = new Student ("�Ѱ���", 100, 92, 82);

		System.out.println("�̸�\t�˰���\t�ΰ�����\t�̻����\t����\t���");
		System.out.println("-------------------------------------------------------------");

		st1.showData();
		st2.showData();
		st3.showData();
		st4.showData();
		
		System.out.println("=============================================================");
		
		Student.showTotal();
		
	}

}
