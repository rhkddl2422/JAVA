package day08;

public class Test02 {
	public static void main(String[] args) {
		
		SingleTone a = new SingleTone()
		SingleTone a = new SingleTone()
		SingleTone a = new SingleTone()
		
		
	}

}

class SingleTone
{    private static SingleTone a;
	 private SingleTone(){}
	
	
	public static SingleTone getInstance()
	{
		
		if(a==null) a = new SingleTone();
		return a;
		
	}// static
	
	
	
}