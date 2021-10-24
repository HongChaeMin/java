package jenerics;

// 클래스를 만들 때 타입을 넣어주어야됨
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
