package forwhile;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int max = 0;
		
		int arr[] = new int[]{56, 1 ,78, 45, 22, 77};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
				}
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
