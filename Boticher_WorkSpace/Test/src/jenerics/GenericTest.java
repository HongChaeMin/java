package jenerics;

public class GenericTest {

	public static void main(String[] args) {
		
		Generics<String> str = new Generics<>();
		str.setT("ȫä��");
		System.out.println(str.getT());

		Generics<Integer> in = new Generics<>();
		in.setT(19);
		System.out.println(in.getT());
		
		GenericsPerson<String, Integer> p1 = new GenericsPerson<>("ȫä��", 19);
		GenericsPerson<Integer, String> p2 = new GenericsPerson<>(19, "ȫä��");
				
		disp(p1);
		
	}
	
	public static <T, V> void disp(GenericsPerson<T, V> p) {
		System.out.println(p.getName() + " " + p.getAge());
	}
	
}
