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
		System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg �Դϴ�.");
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