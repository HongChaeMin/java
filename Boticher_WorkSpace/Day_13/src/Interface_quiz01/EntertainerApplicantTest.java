package Interface_quiz01;

public class EntertainerApplicantTest {

	public static void main(String[] args) {
		
		EntertainerApplicant coals = new EntertainerApplicant();
		
		JypEntertainment jyp = new JypEntertainment();
		jyp.actorAudition(coals);
		jyp.idolAudition(coals);;

	}

}
