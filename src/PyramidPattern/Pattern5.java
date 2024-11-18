package PyramidPattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row ");
		int row = sc.nextInt();
		
		for(int i=row; i>=1; i--) {
			for(int j=row-1; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=i; k<=row; k++) {
				System.out.print(k+" ");
			}
//			for(int s=row-i; s>=1; s-- ) {
//				System.out.print(i+" ");
//			}
			System.out.println();
			
			
		}
	}
}


// incorrect