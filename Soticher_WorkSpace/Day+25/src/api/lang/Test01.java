package api.lang;

public class Test01 {

	int a = 5;
	
	@Override
	public boolean equals(Object obj) {
		return this.a == ((Test01)obj).a;
	}
	
	@Override
	public String toString() {
		return this.getClass()+"@[ a = "+a+"]";
	}
	
	public static void main(String[] args) {
		//Object - ���� Ŭ������ ����
		// - �ڹٿ��� ��������� Ŭ������ �ݵ�� �ְ� �������� ObjectŬ������ ��ӹ޴´�
		// - ��� Ŭ������ �⺻������ ������ �־�� �� �������� ��ɵ��� ������ �ִ� Ŭ����
		//(�θ��� ��)
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Test01();

		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		
		System.out.println(a.getClass());
		System.out.println(c.getClass());
		
		System.out.println("============================");
		
		//hashCode - ��ü���� �����ϱ� ���� �Ϸù�ȣ
		// - ���߿� �ؽ��۾��� ���Ͽ� ���� ��ü�� ������ �� �ְ� �����
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println("============================");
		
		//equals - ��ü�� �������� �Ǵ��ϴ� �޼ҵ�
		// - ��ü���� ���� �� ����ϴ� �޼ҵ�
		// - ObjectŬ������ �ִ� �޼ҵ带 ����ϸ�  hashCode���� ���ϹǷ� �ٸ� �� �ۿ� ����
		// - ��ü�� �°� �������̵带 �ؼ� ����ϴ� ���̴�
		
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));//**************
		
		System.out.println("============================");
		
		//toString - ��ü�� ������ �����ؼ� ���ڿ� ���·� ��ȯ�ϴ� �޼ҵ�
		// - ��ü�� ��Ȳ�� �°� �������̵��ؼ� ����Ѵ�
		// - toString�� ��������
		
		System.out.println(a.toString());
		System.out.println(c.toString());
		
		System.out.println(c);
		
	}

}
