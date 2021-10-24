package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {

		int ko = 93, math = 88, eg = 94;

		System.out.println("국어 " + ko + "점, 수학 " + math + "점, 영어 " + eg + "점");

		System.out.println("평균 : " + ((Math.round((ko + math + eg) / 3.0 * 100) / 100.0)));

		int celsius = 30;

		System.out.println("섭씨 " + celsius + "도는 화씨 " + (int)(1.8 * celsius + 32) + "도 입니다");

	}

}
