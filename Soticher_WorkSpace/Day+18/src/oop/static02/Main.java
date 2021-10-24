package oop.static02;

public class Main {

	public static void main(String[] args) {
		
		Info in1 = new Info("»Ç·Î·Î", 19);
		Info in2 = new Info("Å©·Õ", 19);
		Info in3 = new Info("·çÇÇ", 19);
		
		in1.disp();
		in2.disp();
		in3.disp();
		
		
		System.out.println("ÃÑ ÇÐ»ýÀÇ ¼ö : "+Info.getSu()+"¸í");
		
	}

}
