package day10;

class MyStack{
	
	private int [] stack =null;
	int cnt=0;
   
	MyStack()
	{
		stack = new int[10];
		
	}
	
		
	MyStack(int size)
	
	{
		if(size<0)
			
		{	stack = new int[10];}
		
		else stack = new int[size];
		
			
		
	}
	
	

	


	public boolean isEmpty() {
		
		return cnt==0?true:false;
	}


	public boolean isFull() {
		
		return cnt==stack.length?true:false;
	}


	public void push(int i) {
	
		if(isFull()) return;
		int[] temp =new int [stack.length*2];
		System.arraycopy(stack,0,temp,0,stack.length);
		stack[cnt] =i;
		cnt++;
		
	   			
	}


	public int top() {
		// TODO Auto-generated method stub
		if(isEmpty())return -1;
		return stack[cnt-1];// cnt���� 
	}


	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) return -1;
		return stack[--cnt];// cnt��ü�� 1�����Ѵ�.
	}


	



}