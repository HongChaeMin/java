package inheritance_quiz02;

public class HealthRate extends HeatlhInfo {
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	public String bmw() {

		double stWeight = (super.height - 100) * 0.9;
		double bmw = (super.weight - stWeight) / stWeight * 100;
		
		if(bmw > 20) {
			return "비만 입니다";
		}else if(bmw > 10) {
			return "과체중 입니다";
		}else {
			return "정상입니다";
		}
	}
	
	public void disp() {
		super.showInfo();
		System.out.println(bmw());
	}

}
