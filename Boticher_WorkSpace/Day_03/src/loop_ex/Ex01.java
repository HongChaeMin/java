package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");

		// while 문을 사용해서 "안녕" 3번 쓰기;

		int i = 0;
		while (i < 3) {
			System.out.println("안녕 " + i);
			// i = i+1;
			// i += 1; 복합 대입연산자
			// i ++; 후위 증감 연산다
			// ++ i; 전위 증감 연산자
			i++;
		}

		// ++i, i++ 차이점
		int num = 1;
		System.out.println("num : " + num); // 결과 : 1
		System.out.println("num : " + (++num)); // 결과 : 2
		System.out.println("num : " + (num++)); // 결과 : 2
		System.out.println("num : " + num); // 결과 : 3

		// 0 ~ 4 : 5번
		i = 0;
		while(i < 5) {
			System.out.println(++i);
		}

	}

}
