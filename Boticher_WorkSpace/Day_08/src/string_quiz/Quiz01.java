package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		System.out.println("-----문제 1-----");

		String gradeStr = "My grade is A";
		System.out.println(gradeStr.replaceAll("A", "B"));

		System.out.println("-----문제 2-----");

		String birthday = "19950721";

		int year = Integer.valueOf(birthday.substring(0, 4));
		int old = 2021 - year + 1;
		System.out.println(old + "세");

		System.out.println("-----문제 3-----");

		String sentence = "To be, or Not to Be. That Is The Question";

		String[] s = sentence.split(" ");
		System.out.println("단어 개수 : " + s.length);

	}

}
