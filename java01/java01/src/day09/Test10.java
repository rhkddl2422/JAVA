package day09;

public class Test10 {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("������ ���� á���ϴ�.");
		}
		
		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");

		
		
		
		
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

               class MyStack extends Exception{
            	   
            	   
            	   
            	  Class Stack() {
            		  
            		  
            		  
            		  
            		  
            		  
            		  
            	  }
            	   
            	   MyStack()
           		{
           			
            		   super("�����ܰ� ���� �߻� ");
           		}
           		
            	   MyStack(String msg)
            	   
            	   {
           		       super(msg);
           	       	}
            	   
            	   
            	   
            	   
	



                                 }


	}

}
