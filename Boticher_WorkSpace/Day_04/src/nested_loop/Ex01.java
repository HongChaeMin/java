package nested_loop;

public class Ex01 {

	public static void main(String[] args) {

		// ��ø �ݺ��� : �ݺ��� �ȿ� �ݺ���
		// �ٱ� �ݺ��� : õõ�� ����(��Ʈ)
		// ���� �ݺ��� : �������� (Ƚ��)

		// ����Ʈ 10ȸ, 3��Ʈ
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("����Ʈ : " + i + "��Ʈ °, " + j + "ȸ");
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}

}
