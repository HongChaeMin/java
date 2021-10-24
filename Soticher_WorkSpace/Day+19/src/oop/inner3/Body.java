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
			System.out.println("Ű�� �߸� �Է��ϼ̽��ϴ�");
			this.height = 1;
			return;
		}
		this.height = height;
	}
	public void setWeight(double weight) {
		if(weight<0) {
			System.out.println("�����Ը� �߸� �Է��ϼ̽��ϴ�");
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
		
		System.out.println("=====�л� ��ü ����=====");
		System.out.printf("Ű : "+getHeight()+" / ������ : "+getWeight()+" / �񸸵� : "+"%.2f",getBmi());
		
		if(this.bmi<18.5 && this.bmi > 0) {
			System.out.println(", ��ü�� �Դϴ�");
		}
		else if(this.bmi >= 18.5 && this.bmi < 23.0) {
			System.out.println(", ���� ü�� �Դϴ�");
		}
		else if(this.bmi >= 23.0 && this.bmi < 25.0) {
			System.out.println(", ��ü�� �Դϴ�");
		}
		else if(this.bmi >= 25.0 && this.bmi < 30.0) {
			System.out.println(", �浵 �� �Դϴ�");
		}
		else if(this.bmi >= 30.0) {
			System.out.println(", ���� �Դϴ�");
		}
	}
	
}
