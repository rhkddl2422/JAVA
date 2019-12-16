package day08;

public class Fish extends Animal {
	
	String name;
	
	
	public Fish()
	
	{
		super("물고기");
	}
	public Fish(String name)
	{
		super("물고기");
		this.name = name;
	}
	
	public void print()
	{
		System.out.printf("[%s %s]%n",kind,name);
		
	}
	@Override
	public void breath(){
		System.out.println("아가미로 숨쉬기...");
	}
}


//abstrac코드는 자식이 완성을 시켜주어야한다.
//꼭 오버라이딩 하라고 추상화를 해준다.