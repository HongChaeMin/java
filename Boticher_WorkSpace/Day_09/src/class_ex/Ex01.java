package class_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 의식의 흐름

		// 객체로 만든다. 인스턴스 화 한다
		ScoreData sd1 = new ScoreData();

		// 필드에 값 넣기
		sd1.score = 85;
		sd1.subject = "국어";
		sd1.ranking = 7;
		
		// 필드 값 출력하기
		System.out.println(sd1.score);
		System.out.println(sd1.subject);
		System.out.println(sd1.ranking);
		
		sd1.printScoreInfo();
		
	}

}
