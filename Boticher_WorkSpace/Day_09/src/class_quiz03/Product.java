package class_quiz03;

import java.util.Calendar;

public class Product {

	private String name;
	private int price;
	private String shelfLife;
	private int year;
	private int month;
	private int day;

	public Product(String name, int price, String shelfLife) {
		this.name = name;
		this.price = price;
		this.shelfLife = shelfLife;
		setYear(shelfLife);
		setMonth(shelfLife);
		setDay(shelfLife);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(String shelfLife) {
		shelfLife = shelfLife.substring(4, 7);
		this.month = Integer.valueOf(shelfLife);
	}

	public int getDay() {
		return day;
	}

	public void setDay(String shelfLife) {
		shelfLife = shelfLife.substring(8);
		this.day = Integer.valueOf(shelfLife);
	}

	public void setYear(String shelfLife) {
		shelfLife = shelfLife.substring(0, 4);
		this.year = Integer.valueOf(shelfLife);
	}

	public void pricesDisp(int n) {
		System.out.println("��ǰ " + n + "���� ���� : " + (this.price * n));
	}

	// ������ code
	public String availbleSale() {
		
		// "2021-09-22" ���� ��¥ <= ������� : 
		
		// compareTo 
		// ���� ���� �� ũ�� : 1
		// ���� ���� ������ : -1
		// ������ : 0
		
		if(this.shelfLife.compareTo("2021-04-28") > 0) {
			return "�Ǹ� ���� ��ǰ";
		}
		
		return "�Ǹ� �Ұ� ��ǰ";
		
	}
	
	public void shelfLife() {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);

		if (this.year < year && this.month < month && this.day < day) {
			if (0 < this.year && 0 < this.month && 0 < this.day) {
				System.out.println("�Ǹ� ���� ��ǰ");
			}
		} else {
			System.out.println("�Ǹ� �Ұ� ��ǰ");
		}

	}

}
