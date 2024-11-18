package ArraysQ;

import java.util.Arrays;

public class SecondArray {

	public static void main(String[] args) {
		
		int[] ar = {10,30,80,90,60,70};
		int temp = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[1]);
	}
}
