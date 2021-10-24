package oop.inher01;

public class SharpPencil extends Pens{
	
	private float width;
	
	public SharpPencil(float width, int amount) {
		super(amount);
		setWidth(width);
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	public float getWidth() {
		return width;
	}
	
	public void disp() {
		System.out.println("SharpPencil");
		System.out.println("ÆæÀÇ ±½±â : "+getWidth()+"\t³²Àº ¼ö·® : "+getAmount());
	}
	
}
