package exception_ex;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		// ����ó�� : ����ġ ���� ��Ȳ�� ���� ó���� �ϴ� ��
		// try - catch - finally

		// NPE
		try {
			String str = null;
//			System.out.println(str.isEmpty());

			int[] arr = { 1, 2, 3 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}

			// ĳ���� ����
			Object x = new Integer(0);
			System.out.println((String) x);

		} catch (NullPointerException e) {
			System.err.println("NPF�� �߻��ߴ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭 ���� ������ �߻��ߴ�");
		} catch (Exception e) {
			System.err.println("��� ���ܸ� �� ��´�");
		} finally {
			System.out.println("���ܵ� �ƴϵ� ������ �ҷ�����");
		}

		System.out.println("����Ϸ�");

		a();
		
	}
	
	public static void a() throws Exception {
		b();
	}
	
	public static void b() throws Exception {
		// ���� �߻� ��Ű��
		
		// checked exception : Exception	- try - catch ����ó��
		// unchecked exception : RuntimeException	- �ٷ� ���α׷��� �����ȴ�
		
		// �ٷ� ���α׷��� ����� throw new RuntimeException();
		
		// ó�� ��� 2����
		// 1. ���� ó���Ѵ� (try - catch)
		// 2. ȸ���Ѵ� (throws)
		throw new Exception();
	}

}