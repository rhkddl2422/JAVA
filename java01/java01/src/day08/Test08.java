package day08;

public class Test08 {

	public static void main(String[] args) {
		
		Drawable [] s = {new Circle(),  new Rectangle()};
		Moverable [] a = {new Circle(),  new Rectangle()};
		
		for(Drawable data : s ) {
			
			data.draw();
			
			((Moverable)data).move();
			
		}
		System.out.println("===============================================");
		
		T[] t (new Circle(), new Rectangle());
		
		for(T data:t)
			data.draw();
		    data.move();
       
	
		
	}

}


interface Drawable{
	
	
	void draw();
	
	
	
}


interface Moverable{
	
	void move();	
	
}

interface T extends Drawable,Moverable();


class Circle implements  T
{
	
	String name = "Rectengular";
	
	public void move()
	{System.out.println(name+"이동(move)");
		
		
	}
	
	public void draw()
	{
		System.out.println(name+"그리기(draw)");
	}
}

class Rectangle implements  T
	
	String name ="Rectangular";

public void move()
{System.out.println(name+"이동(move)");
	
	
}

public void draw()
{
	System.out.println(name+"그리기(draw)");
}
	
	
}

