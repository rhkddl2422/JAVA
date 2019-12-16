package day07;

public class Test02 {
	public static void main(String[] args) {
		//is a 관계
        // 모든 객체의 데이터 타입은 부모가 될수 있다.
        
		Object a = new Animal(); // opject가 최상위개념이기 때문에 Animal
	
        ((Animal)a).breath();//downcasting 
        
		Animal a2 = new Animal();
		a2.breath();
		
		Object obj = a2;
		Animal temp = (Animal)obj;
		temp.breath();
		
		Dog d = new Dog();
		Dog c = new Dog();
		System.out.println(c.kind);
		Object obj2 = d;
		Animal a3 = (Animal)obj2;
		Dog d3 = (Dog)obj2;
		System.out.println(a3.kind);
		System.out.println(d3.kind);
		
		System.out.println("====================================================");
		
		String msg = "hello java";
		Object obj7 = msg;
		if(obj7 instanceof Dog)
		System.out.println(((Dog)obj7).kind);
		
		if(obj7 instanceof String)
		System.out.println(((String)obj7).toUpperCase());//컴파일러가 못잡아 주는 다운케스팅
		//Object는 모든것을 담을수 있지만 다운케스팅을 잘못하면 죽어버린다.

	}
}
