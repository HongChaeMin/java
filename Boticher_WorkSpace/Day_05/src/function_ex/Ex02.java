package function_ex;

// static ����  - static
// stack ���� - int, double
// heap ���� - int[], String

public class Ex02 {

	public static void main(String[] args) {

		// �޼ҵ� �����
		// 1. � �Լ��� ������ �޼ҵ� ���� ���´�
		// 2. input�� ������ ������ �����Ѵ�
		// 3. output�� �������� �������� �����Ѵ�
		// 4. �����Ѵ�

		// �޼ҵ带 ����ϴ� ��
		int x = 30;
		int y = 50;
		int result = sum(x, y); // ���� ���ڰ�, argument
		System.out.println("�հ� : " + result);

		printHelloWorld(); // �Լ��� ����Ѵ�, �Լ��� �θ���, �Լ��� call�Ѵ�
		
	}

	// �޼ҵ� ����� �� 
	public static int sum(int x, int y) { // �Ű� ����, parameter
		return x + y; // return�� ������ �޼ҵ尡 ����ȴ�
	}

	public static void printHelloWorld() {
		System.out.println("Hello World ~!~!");
	}
	
}
