package array;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int sum = 0;
		
		System.out.print("전체 주사위 기록 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6)+1;
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.print("짝수 주사위 기록 : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\n");
		System.out.println("주사위 값들의 합계 : "+sum);
		
	}

}
