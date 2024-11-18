package InvertedPyramidPattern;

import java.util.Scanner;

public class PatternInverted1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row ");
		int row = sc.nextInt();
		
		for(int i=row; i>=1; i--) {
			for(int j=row-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
