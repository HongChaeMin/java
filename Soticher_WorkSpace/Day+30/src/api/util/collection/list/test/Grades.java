package api.util.collection.list.test;

public class Grades extends Student{

		private int math;
		private int ko;
		private int eg;
		private int sum;
		private double p;
		
		public Grades(String name, int age, int math, int ko, int eg) {
			super(name, age);
			setMath(math);
			setKo(ko);
			setEg(eg);
			setSum(this.math+this.ko+this.eg);
			setP(this.sum/3.0);
		}
		
		public void setMath(int math) {
			if(math < 0) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
				this.math = 0;
				return;
			}
			this.math = math;
		}
		public void setKo(int ko) {
			if(ko < 0) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
				this.ko = 0;
				return;
			}
			this.ko = ko;
		}
		public void setEg(int eg) {
			if(eg < 0) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
				this.eg = 0;
				return;
			}
			this.eg = eg;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public void setP(double p) {
			this.p = p;
		}
	
		public int getMath() {
			return math;
		}
		public int getKo() {
			return ko;
		}
		public int getEg() {
			return eg;
		}
		public int getSum() {
			return sum;
		}
		public double getP() {
			return p;
		}
		
		public void disp() {
			super.disp();
			System.out.println("\n=====�л� ����=====");
			System.out.println("���� : "+math+" / ���� : "+ko+" / ���� : "+eg+" / ���� : "+sum+" / ��� : "+p);
		}
	
}
