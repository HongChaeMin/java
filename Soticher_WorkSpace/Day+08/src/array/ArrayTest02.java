package array;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int sum = 0;
		
		System.out.print("��ü �ֻ��� ��� : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6)+1;
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.print("¦�� �ֻ��� ��� : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\n");
		System.out.println("�ֻ��� ������ �հ� : "+sum);
		
	}

}
