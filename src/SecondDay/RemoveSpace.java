package SecondDay;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String string = sc.nextLine();
		String new_s = "";
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)!=' ') {
				new_s = new_s + string.charAt(i);
			}
		}
		
		System.out.println(new_s);
		
	}
}
