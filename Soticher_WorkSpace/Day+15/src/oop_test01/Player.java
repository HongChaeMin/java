package oop_test01;

public class Player {
	
	private String id;
	private int sp;
	private int hp;
	private Player py;
	
	public Player(String _id, int _sp, int _hp) {
		if(_sp<0 || _hp<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			sp = 1;
			hp = 1;
			this.setId(id);
		}
		this.setHp(_hp);
		this.setId(_id);
		this.setSp(_sp);
	}
	public Player() {
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			hp = 1;
		}else {
			this.hp = hp;
		}
	}
	public void setSp(int sp) {
		if(sp<0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			sp = 1;
		}else {
			this.sp = sp;
		}
	}
	
	public int getHp() {
		return hp;
	}
	public String getId() {
		return id;
	}
	public int getSp() {
		return sp;
	}

	public void disp() {
		System.out.println(getId()+"\t"+getSp()+"\t"+getHp());
	}
	
	public void attack(Player p) {
		p.hp -= sp;
	}
	
	public void target(Player p, int n) {
		for(int i=1; i<=n; i++) {
			p.hp -= sp;
		}
		if(p.hp < 0) {
			System.out.print("���� ��� : ");
			p.disp();
			System.out.println("�׾����ϴپƾƤ��� �̤Ф̤Ф�");
		}else {
			System.out.print("���� ��� : ");
			p.disp();
			System.out.println("�̰���ϴپƾƤ��Ӥ� !~!~!~!~!");
		}
		System.out.println();
	}
	
}
