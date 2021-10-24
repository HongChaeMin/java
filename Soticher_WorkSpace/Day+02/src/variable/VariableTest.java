package variable;

public class VariableTest {
	
	public static void main(String[] args) {
		
		int moth = 100;
		int year = moth*12;
		
		double r = year*0.9;
		
		System.out.println("문제1) "+r+"원");
		
		//int 월급 = 100;
		//int 세전연봉 = 월급 * 12;
		//int 세금 = 세전연봉 / 10;
		//int 세후연금 = 세전연봉 - 세금;
		
		int a = 30;
		int b = 50;
		int c = 4;
		
		double sum = (a+b+c)/3;
		
		System.out.println("문제2) "+sum+"점");
		
		int garo = 3;
		int sero = 6;
		
		int hap = (garo*sero)/2;
		
		System.out.println("문제3) "+hap);
		
		int seconed = 100;
		
		System.out.println("문제4) "+seconed/60+"분 "+seconed%60+"초");
		
		int o = 500;
		int v = 100;
		int p = (800/o)*500;
		int y = 800-p;
		
		System.out.println("문제5) "+800/o+"개 "+y/v+"개");
	
	}

}
