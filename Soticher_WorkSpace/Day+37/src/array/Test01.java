package array;

public class Test01 {

	public static void main(String[] args) {

		String names[] = { "ȫ�浿", "������", "������", "�ڹ�ŷ", "������" };

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
