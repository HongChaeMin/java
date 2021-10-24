package oop_test;

import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);
	
	private int[] arr;
	private int size;
	
	//생성
	public Array(int n) {
		if(n > 0) {
			this.arr = new int[n];
			System.out.println("배열의 값을 입력해주세요");
			for(int i=0; i<n; i++) {
				this.arr[i] = sc.nextInt();
			}
			this.size = n;
		}else {
			System.out.println("값을 잘못입력하셨습니다");
			return ;
		}
	}
	
	public Array(int arr[]) {
		this.arr = arr;
		this.size = size();
	}
	
	public Array(Array a) {
		this.arr = a.arr;
		this.size = a.size;
		
	}
	
	public Array(){
	}
	
	//setter
	public void setSize(int size) {
		this.size = size;
	}
	
	//getter
	public int[] getArr() {
		return arr;
	}
	public int getLength() {
		return arr.length;
	}
	public int getSize() {
		return size;
	}
	
	
	//기능
	public void add(int a) {
		if(getLength()>this.size) {
			this.arr[this.size] = a;
			this.size++;
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void add(int a, int b) {
		if(a<this.arr.length && this.arr[a] == 0) {
			this.arr[a] = b;
		}else{
			System.out.println("추가 할 수 없습니다");
			return;
		}
	}
	
	public int get(int a) {
		return this.arr[a];
	}
	
	public void remove() {
		if(this.arr.length>0) {
			int arr[] = new int[this.arr.length-1];
			this.arr = arr;
		}else {
			System.out.println("제거할 데이터가 없습니다");
			return ;
		}
	}
	
	public int size() {
		int sum = 0;
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i] != 0) {
				sum++;
			}
		}
		this.size = sum;
		return size;
	}
	
	//출력
	public void disp() {
		System.out.print("data : ");
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.print("/ date size : "+size()+" / date length : "+getLength());
	}
	
}
