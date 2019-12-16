package Myutill;

import java.util.Iterator;
import java.util.List;

public class Myutill {

	
	
	public static void interratorPaint(List<String> list)
	{
		 Iterator<String> it = list.iterator();
		
            while(it.hasNext()) {
			
			String data = it.next();
			System.out.print(data+(" "));}}}