package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {87,100,24,11,70};
		
		int[] temp = arr; //temp�� �迭�� ����Ȱ� �ƴ϶� �ּҰ��� ����Ȱ��̴�.
		temp[1] = 0;
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(temp[i]+" ");
		}


	}

}
