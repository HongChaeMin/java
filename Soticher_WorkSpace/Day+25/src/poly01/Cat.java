package poly01;

//extends - Ŭ���� ��� Ű���� : Ŭ������ �߻�Ŭ������ ��Ʋ�� �� �ϳ��� ����� �� �ִ�

//CPP���� ���� ����� ���������� ����
// - �޼ҵ��� ��ħ
// - �θ��� ��ħ

//JAVa������ ���� ����� �������� �����Ͽ���
// - �������̽��� ���Ͽ� �������� ��ӹ��� �� �ִ�
// - implements - �������̽� ���� ��� Ű���� : �������̽��� ������ ��Ӱ���

public class Cat extends Animal implements Eat, Bark{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("����");
	}
	
	@Override
	public void bark() {
		System.out.println("�̾߿�");
	}

}
