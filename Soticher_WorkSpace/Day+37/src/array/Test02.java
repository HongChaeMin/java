package array;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
//		String str = "11/100/89";
//		Scanner s1 = new Scanner(str);
//		
//		int arr[] = new int[3];
//		int i = 0;
//		int max = 0;
//		
//		s1.useDelimiter("[/]");
//		
//		while(s1.hasNext()) {
//			int s = Integer.parseInt(s1.next());
//			arr[i] = s;
//			max += arr[i];
//			i++;
//		}
//		System.out.println(max);
//		
//		for(int k=0; k<arr.length; k++) {
//			System.out.println(arr[k]);
//		}
//		
//		for(int j =0; j<arr.length; j++) {
//			String.valueOf(arr[j]+"/");
//		}
		
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		
		int arr[] = new int[3];
		String[] temp = str.split("/");
		
		int tot =0;
		for(int i=0;i<temp.length;i++) {
			arr[i] = Integer.parseInt(temp[i]);
			tot+= arr[i];
		}
		System.out.println("tot ="+tot);
		
		int[] scores = {11, 100, 89};
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		String text = "";
		
		for(int i=0;i<scores.length;i++) {
			text += scores[i]+"";
			if(i != scores.length-1) {
				text+="/";
			}
		}
		System.out.println(text);

	}

}
