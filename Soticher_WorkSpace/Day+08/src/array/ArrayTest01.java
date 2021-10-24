package array;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int a = 0;
		int b = 0;
		
		System.out.println(sum);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				System.out.println(arr[i]+" ");
				a += arr[i];
				b++;
			}
		}

		System.out.println(a);
		System.out.println(b);
	}

}
