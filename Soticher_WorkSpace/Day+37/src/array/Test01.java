package array;

public class Test01 {

	public static void main(String[] args) {

		String names[] = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };

		String max;

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if (0 > names[i].compareTo(names[j])) {
					max = names[i];
					names[i] = names[j];
					names[j] = max;
				}
			}
		}
		
		

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
