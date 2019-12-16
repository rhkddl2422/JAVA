package day08;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = { new Dog("진돗개","체리"), new Fish("쿠우")
				
		};
		
		for(Animal data:animals)
		{
			data.breath();
			
			
			
		}
		
		
		//final과 abstract는 전혀 반대이다. 상속받으면 안된다=final
		
		
		
	}

}
