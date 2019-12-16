package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import Myutill.Myutill;

public class Test05 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("lee");
		set.add("kin");
		set.add("park");
		set.add("ko");
		set.add("lee");
		
		Myutill.interratorPaint(list);
		
		
		Iterator<String> it = set.iterator();
		
           while(it.hasNext()) {
			
			String data = it.next();
			System.out.print(data+(" "));
		
		} 
		System.out.println();
		
		
		
		
	}
	public static void interratorPaint(List<String> list)
	{
		 Iterator<String> it = list.iterator();
		
            while(it.hasNext()) {
			
			String data = it.next();
			System.out.print(data+(" "));
		
		} 
		
		
		
		
	}

}
