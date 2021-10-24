package array;

public class Test01 {

	public static void main(String[] args) {
		
		//증감연산자
		//++ , --
		//	전치		 후치
		//	++a		a++
		//전치 : ++a로 표기하며 a=a+1을 먼저 처리한다
		//후치 : a++로 표기하고 a의 데이터를 사용한 후에 a=a+1
		int a = 0;
		System.out.println(++a);
		a = 0;
		System.out.println(a++);
		System.out.println(a);
		
		int num1 = 12;
		int num2 = 12;
		System.out.println(++num1); // 1.12 + 1 2.실행
		System.out.println("num1 :"+num1); //13
		
		System.out.println(num2++); // 1.실행 2.12+1
		System.out.println("num2 :"+num2);//13
		
		num1 = 12;
		System.out.println(num1+=1);// 더하기 다음 실행
		System.out.println(num1);//출력을 할때 증감연산자를 사용하실꺼면 전치
		num2 = 12;
		System.out.println(num2=+1);// 실행 다음 더하기
		System.out.println(num2); 
		//1씩 더하기만 하실꺼면은 후치를 사용하셔서 a++;

	}

}
