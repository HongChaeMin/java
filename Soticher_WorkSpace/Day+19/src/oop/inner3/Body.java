package oop.inner3;

public class Body extends Grades{

	private double height;
	private double weight;
	private double bmi;
	
	public Body(String name, int age, int math, int ko, int eg, double height, double weight) {
		super(name, age, math, ko, eg);
		setWeight(weight);
		setHeight(height);
		this.bmi = this.weight/Math.pow((this.height*0.01), 2.0);
	}
	
	public void setHeight(double height) {
		if(height<0) {
			System.out.println("키를 잘못 입력하셨습니다");
			this.height = 1;
			return;
		}
		this.height = height;
	}
	public void setWeight(double weight) {
		if(weight<0) {
			System.out.println("몸무게를 잘못 입력하셨습니다");
			this.weight = 1;
			return;
		}
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getBmi() {
		return bmi;
	}
	
	public void disp() {
		super.disp();
		
		System.out.println("=====학생 신체 정보=====");
		System.out.printf("키 : "+getHeight()+" / 몸무게 : "+getWeight()+" / 비만도 : "+"%.2f",getBmi());
		
		if(this.bmi<18.5 && this.bmi > 0) {
			System.out.println(", 저체중 입니다");
		}
		else if(this.bmi >= 18.5 && this.bmi < 23.0) {
			System.out.println(", 정상 체중 입니다");
		}
		else if(this.bmi >= 23.0 && this.bmi < 25.0) {
			System.out.println(", 과체중 입니다");
		}
		else if(this.bmi >= 25.0 && this.bmi < 30.0) {
			System.out.println(", 경도 비만 입니다");
		}
		else if(this.bmi >= 30.0) {
			System.out.println(", 고도비만 입니다");
		}
	}
	
}
