package loop_ex;

public class Ex01 {

	public static void main(String[] args) {

//		System.out.println("�ȳ�");
//		System.out.println("�ȳ�");
//		System.out.println("�ȳ�");

		// while ���� ����ؼ� "�ȳ�" 3�� ����;

		int i = 0;
		while (i < 3) {
			System.out.println("�ȳ� " + i);
			// i = i+1;
			// i += 1; ���� ���Կ�����
			// i ++; ���� ���� �����
			// ++ i; ���� ���� ������
			i++;
		}

		// ++i, i++ ������
		int num = 1;
		System.out.println("num : " + num); // ��� : 1
		System.out.println("num : " + (++num)); // ��� : 2
		System.out.println("num : " + (num++)); // ��� : 2
		System.out.println("num : " + num); // ��� : 3

		// 0 ~ 4 : 5��
		i = 0;
		while(i < 5) {
			System.out.println(++i);
		}

	}

}
