package day07;

public class Test05 {
	
	public static void main (String[] args)
	{
		Dog[] d;
		Fish[] f;
		Animal [] animals = {
				
				new Dog("진돗개","해리"),
				new Fish("쿠피"),
				new Fish("낙지"),
				new Dog("발발이","시츄")
				
		};
		
		for(Animal data:animals) {
			
			if(data instanceof Dog)
			{((Dog)data).print();     }
			if(data instanceof Fish)
			{((Dog)data).print();     }
			{((Fish)data).print(); }
		}
		
		//anlimal type으로 프린트 메소드 호출이 불가능하다.
		
		
	}

}
