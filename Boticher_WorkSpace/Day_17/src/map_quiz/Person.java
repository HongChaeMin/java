package map_quiz;

public class Person {

	private String name;
	private int brith;
	
	public Person(String name, int brith) {
		this.name = name;
		this.brith = brith;
	}
	
	public void disp() {
		System.out.println("이름 : " + this.name + ", 생년월일 : " + this.brith);
	}

	public String getName() {
		return this.name;
	}
	
}
