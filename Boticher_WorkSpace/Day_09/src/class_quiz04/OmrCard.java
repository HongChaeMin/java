package class_quiz04;

public class OmrCard {

	private String name;
	private int studentId;
	private int[] stuAnswer = new int[5];

	public OmrCard(String name, int studentId, int[] stuAnswer) {
		this.name = name;
		this.studentId = studentId;
		this.stuAnswer = stuAnswer;
	}
	public OmrCard() {
	}
	
	public int[] getStuAnswer() {
		return stuAnswer;
	}
	public void setStuAnswer(int[] stuAnswer) {
		this.stuAnswer = stuAnswer;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		if (studentId < 0) {
			System.out.println("�й��� �߸� �Է��ϼ̽��ϴ�");
			this.studentId = 0;
			return;
		}
		this.studentId = studentId;
	}
	
}
