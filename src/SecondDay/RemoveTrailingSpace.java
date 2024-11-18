package SecondDay;

import java.util.Scanner;

public class RemoveTrailingSpace {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String string = sc.nextLine();
		
		System.out.println("old string "+string);
		String new_s = string.trim();
//		String new_str = string.strip();
		System.out.println("new String "+new_s);
//		System.out.println("new string using strip "+new_str);
	}

}
