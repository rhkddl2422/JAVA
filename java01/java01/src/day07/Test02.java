package day07;

public class Test02 {
	public static void main(String[] args) {
		//is a ����
        // ��� ��ü�� ������ Ÿ���� �θ� �ɼ� �ִ�.
        
		Object a = new Animal(); // opject�� �ֻ��������̱� ������ Animal
	
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
		System.out.println(((String)obj7).toUpperCase());//�����Ϸ��� ����� �ִ� �ٿ��ɽ���
		//Object�� ������ ������ ������ �ٿ��ɽ����� �߸��ϸ� �׾������.

	}
}
