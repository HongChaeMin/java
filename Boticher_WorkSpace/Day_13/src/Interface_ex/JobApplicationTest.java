package Interface_ex;

public class JobApplicationTest {

	public static void main(String[] args) {
		
		// ���ػ�
		JobApplicant coals = new JobApplicant();
		
		// ȸ�� ä�����
		Samsung samsung = new Samsung();
		samsung.recruitJavaProgrammer(coals);
		samsung.recruitCProgramming(coals);
		
	}

}
