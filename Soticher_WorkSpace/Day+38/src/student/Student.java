package student;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	// Å¬·¡½º

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Student(String name, int kor, int eng, int math) {
		setName(name);
		setKor(kor);
		setMath(math);
		setEng(eng);
		setTot(kor, math, eng);
		setAvg(tot);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTot(int kor, int math, int eng) {
		this.tot = kor + math + eng;
	}

	public void setAvg(int tot) {
		this.avg = tot / 3.0;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
	public void disp() {
		System.out.println(
				getName() + "\t" + getKor() + "\t" + getEng() + "\t" + getMath() + "\t" + getTot() + "\t" + getAvg());
	}

}
