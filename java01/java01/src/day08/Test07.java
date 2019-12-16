package day08;

public class Test07 {
	public static void main(String[] args) {

		
		Circle1 a = new Circle1();
	
		System.out.println(a.cArea(5));
		
		Circle2 i = new Circle2();
		System.out.println(i.color(0));
	}
}

class Circle1 extends Shape_a {
	// ���� ���� ?
	@Override
	public double cArea(double r) {
		return Math.PI * r * r;
	}
}

abstract class Shape_a {
	String color;
	public abstract double cArea(double r);
	public void print() {
	}
}



interface shape_i{
	final static String color="red";
	double cArea(double r);
	
}
class Circle_i extends Object implements shape_i
{

	public double cArea (double r)
	{
		 return Math.PI * r * r;
	
}
}
