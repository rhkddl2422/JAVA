package day10;

import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("java01","1234");
		map.put("java02","1232");
		map.put("java03","1234");
		map.put("java04","1234");
		map.put("java05","1234");
		map.put("java06","1234");
		map.put("java07","1234");
		map.put("java08","1234");
		map.put("java09","1234");
		map.put("java10","1234");
		map.put("java11","1234");
		map.put("java12","1234");
		map.put("java13","1234");
		map.put("java14","1234");
		
		//맵구조 순회
		
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			String id =(String)it.next();
			System.out.println(id+"= "+map.get(id));
			
			
		}
		//로그인 처리
		Scanner scanner = new Scanner (System.in);
		
		while(true)
		{
			
			System.out.println("ID를 입력하세요");
			String id =scanner.nextLine().trim();
			System.out.println("PW를 입력하세요");
			String pw =scanner.nextLine().trim();
			
		   if(map.containsKey(id)) {
			   System.out.println("id x");
		   continue;
		}else {
			if(map.get(id).equalsIgnoreCase(pw))
			{
				
				System.out.println("로그인 성공");
				 break;
			}else {
					System.out.println("로그인 실패");
				}
				
			}
		}
		scanner.close();
		scanner = null;
		
		System.out.println("비밀번호를 입력하세요");
		}
}
		
		
		
		
		
	

	
	


