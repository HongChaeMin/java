package api.util.list;

public class Student{
	
	private String name;
	private int ar;
	private int ai;
	private int ma;
	private int sum;
	private double avg;
	
	public Student(String name, int ar, int ai, int ma) {
		setName(name);
		setAr(ar);
		setAi(ai);
		setMa(ma);
		setSum(this.ar+this.ai+this.ma);
		setAvg(this.sum/3.0);
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAr(int ar) {
		this.ar = ar;
	}
	public void setAi(int ai) {
		this.ai = ai;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getAr() {
		return ar;
	}
	public int getAi() {
		return ai;
	}
	public int getMa() {
		return ma;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	
	public void showData() {
		System.out.println(name+"\t"+ar+"\t"+ai+"\t"+ma+"\t"+sum+"\t"+avg);
	}
	
	
}
