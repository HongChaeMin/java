package oop.inher02;

public class Main {

	public static void main(String[] args) {

		
		Info in3 = new Info("ȫä��", 9);
				
		NewInfo in4 = new NewInfo("ȫä��", 19, 161);
		
		in3.disp();
		in4.disp();
		
		System.out.println();
		
		System.out.println(in4.getName()+" "+in4.getAge());
		System.out.println(in3.getName()+" "+in3.getAge());
	}

}
