package opp_test03;

public class Main {

	public static void main(String[] args) {
		
		Info arr[] = new Info[3];
		
		arr[0] = new Info("ȫä��", 19, 50, 50, 50);
		arr[1] = new Info("��ä��", 20, 70, 70, 70);
		arr[2] = new Info("��ä��", 21, 60, 60, 60);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].disp();
		}
		
		
	}

}
