package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import day06.ex.Book;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("-----------START------------");
		
		try(Scanner scanner = new Scanner(new File("bookdata.txt"));) {
			
			
			StringTokenizer st=null;
			int price = Integer.parseInt(st.nextToken());
			while(scanner.hasNextLine()) {
                st = new StringTokenizer(scanner.nextLine());
                
                
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt ���� Ȯ�� �� �ּ���");
		}
		

		System.out.println("-----------END------------");
	}
}
