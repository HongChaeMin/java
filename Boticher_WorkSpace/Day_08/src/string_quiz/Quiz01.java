package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		System.out.println("-----���� 1-----");

		String gradeStr = "My grade is A";
		System.out.println(gradeStr.replaceAll("A", "B"));

		System.out.println("-----���� 2-----");

		String birthday = "19950721";

		int year = Integer.valueOf(birthday.substring(0, 4));
		int old = 2021 - year + 1;
		System.out.println(old + "��");

		System.out.println("-----���� 3-----");

		String sentence = "To be, or Not to Be. That Is The Question";

		String[] s = sentence.split(" ");
		System.out.println("�ܾ� ���� : " + s.length);

	}

}
