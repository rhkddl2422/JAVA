package day08;

public class Test04 {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1+""+msg2); //��ü ���Ҷ� �׻�equals�� ���
		System.out.println(msg1.equals(msg2)); //��ü ���Ҷ� �׻�equals�� ���
		
		Person p1 = new Person("ȫ�浿", 22);
		Person p2 = new Person("ȫ�浿", 22);
		Person p3 = null;
		System.out.println(p1+""+p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(msg1));

		System.out.println("===============");
		System.out.println(msg1.toString());
		System.out.println(msg2);
		
		System.out.println(p1);
		System.out.println(p2.toString());
		Object obj = p1;
		System.out.println(obj.toString());	//person�� toString�� ����ȴ�, �θ�� �ڽ� �Ѵ� toString�� ������ �ڽĸ��� ȣ��ȴ�.
		System.out.println(((Person)obj).name);
		
		obj = msg1;
		System.out.println(obj);
		System.out.println(((String)obj).toUpperCase());
	}
}

class Person{
	String name;
	int age;
	
	public Person()	{
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
    public String toString() {
    	return "Person["+name+" : "+age+"]";
    }
    @Override
    	public boolean equals(Object obj) {
    		boolean f = false;
    		if(obj instanceof Person)	{	//�ٿ�ĳ����
    			Person p =(Person) obj;
    			if(name.equals(p.name)&& age == p.age ) {
    				f = true;
    			}
    		}
    		
    		return f;
    	}

}
