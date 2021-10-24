package class_quiz01;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 생년월일, 성별을 입력해주세요");
		Person ps1 = new Person(sc.next(), sc.next(), sc.next());
		
		ps1.인사하기();
		ps1.걷기();
		ps1.소개하기();
		ps1.나이알려주기();

	}

}
