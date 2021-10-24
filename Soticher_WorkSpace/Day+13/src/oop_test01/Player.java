package oop_test01;

public class Player {

	private String id;
	private int lv;
	private int sp;
	private int hp;
	
	public Player(String _id) {
		id = _id;
		lv = 1;
		sp = 5;
		hp = 20;
	}
	
	public void setId(String _id) {
		id = _id;
	}
	
	public void setLv(int _lv) {
		if(_lv<1) {
			System.out.println("������ �߸��Է��ϼ̽��ϴ�");
			lv = 1;
		}else {
			lv = _lv;
		}
	}
	
	public String getId() {
		return id;
	}
	
	public int getLv() {
		return lv;
	}
	
	public int getSp() {
		if(lv!=1) {
			for(int i=1; i<lv; i++) {
				sp += 3;
			}
			return sp;
		}else {
			return sp=5;
		}
		
	}
	
	public int getHp() {
		if(lv!=1) {
			for(int i=1; i<lv; i++) {
				hp += 10;
			}
			return hp;
		}else {
			return hp=20;
		}
	}

	public void levUp() {
		lv += 1;
		sp += 3;
		hp += 10;
	}
	
	public void disp() {
		System.out.println("���̵� : "+id+", ���� : "+getLv()+", ���ݷ� : "+getSp()+", ü�� : "+getHp());
	}
	
}
