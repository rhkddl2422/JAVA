package report;

import day07.Animal;
import day07.Dog;
import day07.Fish;

public class main {

	public static void main(String[] args) {
		
		
		 
		Person[] persons= { new Employee("�̼���",30,"JAVA"),new Student("ȫ�浿",20,200201),
				            new Teacher("���ñ�",27,"����"), new Employee ("��浿",50,"�Թ�") };
				
				
				
				for(Person data:persons)//Person �迭�� ó������ ������ ���鼭 �������� ��  person�迭 ���ڸ� �޾� ���ڴ�...
				{
					data.print();
//					
//					if(data instanceof Employee)
//					{((Employee)data).print();     }
//					if(data instanceof Student)
//					{((Student)data).print();     }
//					
				}
				
				
				
		};

	}


