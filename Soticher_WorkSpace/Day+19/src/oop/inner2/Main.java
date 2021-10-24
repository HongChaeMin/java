package oop.inner2;

import oop.inner2.Suit.Top;

public class Main {

	public static void main(String[] args) {
		
		Suit s = new Suit();
		
		Suit.Top t = s.new Top();
		
		t.setPrice(28);
		t.disp();
		s.setPrice(12);
		s.disp();
		
		System.out.println(t.getPrice()+s.getPrice());
		
	}

}
