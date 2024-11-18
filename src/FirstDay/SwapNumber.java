package FirstDay;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number ");
		int a = sc.nextInt();
		System.out.println("Enter a second number ");
		int b = sc.nextInt();
		
		System.out.println("before swap "+a+" "+b+" ");
		if(a!=b) {
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("after swap "+a+" "+b+" ");
			
		}
		
		
		
	}
}
