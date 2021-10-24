package nested_loop;

public class Ex01 {

	public static void main(String[] args) {

		// 중첩 반복문 : 반복문 안에 반복문
		// 바깥 반복문 : 천천히 돈다(세트)
		// 안쪽 반복문 : 빨리돈다 (횟수)

		// 스쿼트 10회, 3세트
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("스쿼트 : " + i + "세트 째, " + j + "회");
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}

}
