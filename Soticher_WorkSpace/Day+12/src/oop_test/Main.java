package oop_test;

public class Main {

	public static void main(String[] args) {
		
		Info in = new Info();//°´Ã¼¸¦ ¸¸µå´Â °úÁ¤
		Info in1 = new Info();
		
		in.setData("È«Ã¤¹Î", 19);
		in1.setData("È«Ã¤¹Î", 9);
		
		in.disp();
		in1.disp();
		
		System.out.println(in.getName() + in1.getName());
		
	}

}
