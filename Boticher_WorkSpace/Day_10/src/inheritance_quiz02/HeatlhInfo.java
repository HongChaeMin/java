package inheritance_quiz02;

public class HeatlhInfo {

	protected String name;
	protected int height;
	protected int weight;

	public HeatlhInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void showInfo() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
}