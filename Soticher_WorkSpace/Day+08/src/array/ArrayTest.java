package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//참조형변수와 일반변수의 구별법
		// 일반변수는 null로 초기화 되지 x
		
		int a = 0;
		int[] arr = null;
		//a = null; error - 일반변수이기때문에
		System.out.println(arr);
		//배열은 인덱스가 0번부터 시작
		//배열이 크기가 5이면은 인덱스는 4까지
		arr = new int[] {10,15,20,0,0};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);//index out - error
		
		int[] arr1 = new int[5]; // 0 1 2 3 4 index
		arr1[0] = 10;
		arr1[1] = 15;
		arr1[2] = 20;
		
		System.out.println(arr.length);//배열의 개수를 구해주는 명령
		//0~4까지 반복
		for(int i=0;i<arr1.length;i++) {//i가 index이기 때문에 0~4
			System.out.println("arr["+i+"] ="+arr1[i]);
		}
		for(int i=0;i<arr.length;i++) {//i가 index이기 때문에 0~4
			System.out.println("arr["+i+"] ="+arr[i]);
		}

	}

}
