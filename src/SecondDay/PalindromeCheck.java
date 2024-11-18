package SecondDay;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String string = sc.nextLine();
		String new_s = "";
		for(int i=string.length()-1; i>=0; i--) {
			new_s = new_s + string.charAt(i);
		}
		
		if(string.equals(new_s)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}
}
