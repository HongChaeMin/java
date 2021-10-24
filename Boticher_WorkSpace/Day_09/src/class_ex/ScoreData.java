package class_ex;

// 설계도 (붕어빵 틀)
public class ScoreData {

	// 속성 : 멤버변수, 필드 (field)
	int score;
	String subject;
	int ranking;

	// 행위 : 메소드 (method)
	public void printScoreInfo() {
		System.out.println("점수 : " + this.score);
		System.out.println("과목 : " + this.subject);
		System.out.println("순위 : " + this.ranking);
	}

}
