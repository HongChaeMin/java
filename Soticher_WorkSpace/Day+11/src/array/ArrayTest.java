package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {87,100,24,11,70};
		
		int[] temp = arr; //temp에 배열이 복사된게 아니라 주소값이 저장된것이다.
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
