package report;

import day07.Animal;
import day07.Dog;
import day07.Fish;

public class main {

	public static void main(String[] args) {
		
		
		 
		Person[] persons= { new Employee("이순신",30,"JAVA"),new Student("홍길동",20,200201),
				            new Teacher("김택광",27,"수학"), new Employee ("김길동",50,"먹방") };
				
				
				
				for(Person data:persons)//Person 배열을 처음부터 끝까지 돌면서 데이터의 그  person배열 인자를 받아 쓰겠다...
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


