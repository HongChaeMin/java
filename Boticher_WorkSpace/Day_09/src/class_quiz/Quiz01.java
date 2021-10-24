package class_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름, 나이, 반, 전화번호를 입력해주세요");
		StudentTest st1 = new StudentTest(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
		
		st1.disp();
		
        System.out.println("학생의 이름, 나이, 반, 전화번호를 입력해주세요");
		StudentTest st2 = new StudentTest(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
		
		st2.disp();
		        
	}

}
