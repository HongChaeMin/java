package variable;

public class VariableTest {
	
	public static void main(String[] args) {
		
		int moth = 100;
		int year = moth*12;
		
		double r = year*0.9;
		
		System.out.println("����1) "+r+"��");
		
		//int ���� = 100;
		//int �������� = ���� * 12;
		//int ���� = �������� / 10;
		//int ���Ŀ��� = �������� - ����;
		
		int a = 30;
		int b = 50;
		int c = 4;
		
		double sum = (a+b+c)/3;
		
		System.out.println("����2) "+sum+"��");
		
		int garo = 3;
		int sero = 6;
		
		int hap = (garo*sero)/2;
		
		System.out.println("����3) "+hap);
		
		int seconed = 100;
		
		System.out.println("����4) "+seconed/60+"�� "+seconed%60+"��");
		
		int o = 500;
		int v = 100;
		int p = (800/o)*500;
		int y = 800-p;
		
		System.out.println("����5) "+800/o+"�� "+y/v+"��");
	
	}

}
