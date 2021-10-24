package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();
		
		if(weight < 55) System.out.println("치킨 먹쟈 ~!~!");
		
		if(weight >= 100) System.out.println("돼지야 다이어트 좀 해");
		
		if (weight == 68) System.out.println("당신의 몸무게는 68kg이군요 돼지군요");
		
		if(weight != 75) System.out.println("당신의 몸무게는 75kg이 아닙니다 돼지야");
		
		sc.close();
		
	}
}
