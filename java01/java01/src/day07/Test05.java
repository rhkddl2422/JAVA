package day07;

public class Test05 {
	
	public static void main (String[] args)
	{
		Dog[] d;
		Fish[] f;
		Animal [] animals = {
				
				new Dog("������","�ظ�"),
				new Fish("����"),
				new Fish("����"),
				new Dog("�߹���","����")
				
		};
		
		for(Animal data:animals) {
			
			if(data instanceof Dog)
			{((Dog)data).print();     }
			if(data instanceof Fish)
			{((Dog)data).print();     }
			{((Fish)data).print(); }
		}
		
		//anlimal type���� ����Ʈ �޼ҵ� ȣ���� �Ұ����ϴ�.
		
		
	}

}
