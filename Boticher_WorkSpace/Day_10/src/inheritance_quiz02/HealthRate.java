package inheritance_quiz02;

public class HealthRate extends HeatlhInfo {
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	public String bmw() {

		double stWeight = (super.height - 100) * 0.9;
		double bmw = (super.weight - stWeight) / stWeight * 100;
		
		if(bmw > 20) {
			return "�� �Դϴ�";
		}else if(bmw > 10) {
			return "��ü�� �Դϴ�";
		}else {
			return "�����Դϴ�";
		}
	}
	
	public void disp() {
		super.showInfo();
		System.out.println(bmw());
	}

}
