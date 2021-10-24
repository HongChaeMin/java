package Interface_ex;

public class JobApplicationTest {

	public static void main(String[] args) {
		
		// 취준생
		JobApplicant coals = new JobApplicant();
		
		// 회사 채용공고
		Samsung samsung = new Samsung();
		samsung.recruitJavaProgrammer(coals);
		samsung.recruitCProgramming(coals);
		
	}

}
