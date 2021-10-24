package oop_test01;

public class Info {

	public void sum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public void fourSum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
	
	public void fourNum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public void evenNumber(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
}
