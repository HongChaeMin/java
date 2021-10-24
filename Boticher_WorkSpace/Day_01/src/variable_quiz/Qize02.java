package variable_quiz;

public class Qize02 {

	public static void main(String[] args) {

//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.

		int num = 90;
		char sum = 65;
		double avg = 4.0;

		System.out.println("시험 성적이 " + num + "점 이상이면 \'" + sum + "\'학점이고 평점은 " + avg + " 입니다");

		num = 80;
		sum = 66;
		avg = 3.0;

		System.out.println("시험 성적이 " + num + "점 이상이면 \'" + sum + "\'학점이고 평점은 " + avg + " 입니다");

//		두 수의 곱 : 1165.7250000000001

		int number1 = 33;
		double number2 = 35.325;

		System.out.println("두 수의 곱 : "+(number1*1.0*number2));
		
//		943시간은 39일 7시간 입니다.
		
		int hour = 943;
		int day = hour / 24;
		hour %= 24;
		
		System.out.println(hour+"시간은 "+day+"일 "+hour+"시간 입니다");
		
//		사각형의 넓이: 72
//		삼각형의 넓이: 36

		int x = 8, y = 9;
		
		System.out.println("사각형의 넓이 : "+(x*y));
		System.out.println("삼각형의 넓이 : "+(x*y/2));
		
	}

}
