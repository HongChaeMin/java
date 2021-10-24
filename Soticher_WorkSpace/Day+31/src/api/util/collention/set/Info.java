package api.util.collention.set;

public class Info {

	public String name;
	public String num;

	public Info(String name, String num) {
		setName(name);
		setNum(num);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public void disp() {
		System.out.println("이름 : "+name+"\t전화번호 : "+num);
	}
	
}
