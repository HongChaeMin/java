package jenerics;

// Ŭ������ ���� �� Ÿ���� �־��־�ߵ�
public class Generics<T>{

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void disp() {
		System.out.println(this.t);
	}

}