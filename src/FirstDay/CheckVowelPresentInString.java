package FirstDay;

import java.util.Scanner;

public class CheckVowelPresentInString {

	public static void main(String[] args) {
//		checking vowel present or not in string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		
		String string = sc.nextLine();
		boolean flag = false;
		
		for(int i=0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				flag = true;
				break;
			}		
		}
		if(flag==true) {
			System.out.println("present");
		}else {
			System.out.println("nnot");
		}
	}
}
