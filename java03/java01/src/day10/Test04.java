package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;



public class Test04 {

	public static void main(String[] args) {
	    
//		List list1 = new ArrayList();
		
		List<String> list =new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("���浿");
		list.add("���浿");
		list.add("�ֱ浿");
		System.out.println(list.size());
		
		
		System.out.println("--------------for------------------");
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));//Array list �޼ҵ�
			
			
			
		}
		
		System.out.println("ȫ�浿?"+list.contains("ȫ�浿"));//�˻�...
		
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			
			String data = it.next();
			System.out.println(data.charAt(0)+("**"));
			System.out.println(data);
		}
		System.out.println("------------Iterrator ��� ����-------------------");
		//String rename = JOptionPane.showInputDialog("������ �̸��� �����ּ���");
		
		it = list.iterator();
         while(it.hasNext())
         {
        	 String data= it.next();
//        	 if(rename.equals(data))
//                 it.remove();
         }
         System.out.println(list);
        	 
        	 list.add(2,"@@@@@@");
        	 System.out.println(list);
         }
	}

