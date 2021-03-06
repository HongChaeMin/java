package jenerics;

public class GenericsPerson<T, V> {

	private T name;
	private V age;

	public GenericsPerson(T name, V age) {
		this.setName(name);
		this.setAge(age);
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public V getAge() {
		return age;
	}

	public void setAge(V age) {
		this.age = age;
	}
	
}
