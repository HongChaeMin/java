package util.colletion;

public class Score {

	private double ko;
	private double ma;
	private double eg;
	private double sum;
	private double avg;
	
	public Score(double ko, double ma, double eg) {
		setKo(ko);
		setMa(ma);
		setEg(eg);
		setSum(ko, ma, eg);
		setAvg(getSum());
	}
	
	public void setKo(double ko) {
		if(ko<1) {
			System.out.println("점수를 잘못 입력하셨습니다");
			ko = 1;
			return;
		}
		this.ko = ko;
	}
	public void setMa(double ma) {
		if(ma<1) {
			System.out.println("점수를 잘못 입력하셨습니다");
			ma = 1;
			return;
		}
		this.ma = ma;
	}
	public void setEg(double eg) {
		if(eg<1) {
			System.out.println("점수를 잘못 입력하셨습니다");
			eg = 1;
			return;
		}
		this.eg = eg;
	}
	public void setSum(double ko, double ma, double eg) {
		this.sum = ko + ma + eg;
	}
	public void setAvg(double sum) {
		this.avg = sum/3.0;
	}
	public double getAvg() {
		return avg;
	}
	public double getEg() {
		return eg;
	}
	public double getKo() {
		return ko;
	}
	public double getMa() {
		return ma;
	}
	public double getSum() {
		return sum;
	}
	
	public void disp() {
		System.out.println(" 국어 점수 : "+ko+" 수학 점수 : "+ma+" 영어 점수 : "+eg+" 총점 : "+sum+" 평균 : "+avg);
	}
	
}
