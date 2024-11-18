package FirstDay;

import java.util.Scanner;

public class ThirdWay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string here ");
		String string = sc.nextLine();
		String[] array = string.split(" ");
		String new_s = "";
		
		for(String s : array) {
			for(int i = s.length()-1; i>=0; i--) {
				new_s = new_s + s.charAt(i);
			}
			new_s = new_s + " ";
		}
		
		System.out.println(new_s);
	}
}
