package Interface_ex;

// ���ػ�
public class JobApplicant implements CProgramming, JavaProgamming {

	// spec
	private int toeic;
	private double gradePoint; // ����
	private String[] licenses; // �ڰ���

	@Override
	public void objectOriented() {
		System.out.println("��ü ������ --- �� ����");

	}

	@Override
	public void procedure() {
		System.out.println("���������� --- �� ����");
	}

}
