package FirstDay;

import java.util.Scanner;

public class SecondWay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String here ");
		String string = sc.nextLine();
		
		String new_s = "";
		
		for(int i=string.length()-1; i>=0; i--) {
			new_s = new_s + string.charAt(i);
		}
		
		System.out.println(new_s);
	}

}
