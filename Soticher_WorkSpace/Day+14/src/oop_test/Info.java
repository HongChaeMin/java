package oop_test;

public class Info {
	
	public void printEvenOrOdd(int a) {
		if(a%2!=0) {
			System.out.println("È¦¼ö");
		}else {
			System.out.println("Â¦¼ö");
		}
	}
	
	public void sumBetweenValues(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void printPrimeNums(int primenumber) {
		for(int i=2; i<=primenumber; i++) {
			int chek = 0;
			for(int j=2; j<=i; j++)
			if(i%j==0) {
				chek++;
			}
			if(chek==1) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
