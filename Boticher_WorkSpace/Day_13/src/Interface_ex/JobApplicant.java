package Interface_ex;

// 취준생
public class JobApplicant implements CProgramming, JavaProgamming {

	// spec
	private int toeic;
	private double gradePoint; // 학점
	private String[] licenses; // 자격증

	@Override
	public void objectOriented() {
		System.out.println("객체 지향은 --- 고 등등등");

	}

	@Override
	public void procedure() {
		System.out.println("절차지향은 --- 고 등등등");
	}

}
