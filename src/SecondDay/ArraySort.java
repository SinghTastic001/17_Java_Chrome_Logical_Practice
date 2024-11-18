package SecondDay;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
//		int[] array = {1,50,2,5,3,9,7,8,4};
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
		
		int[] ar = {8,3,5,2,4};
		
		int temp = 0;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					System.out.println(temp);
					ar[i]=ar[j];
					System.out.println(ar[i]);
					ar[j] = temp;
					System.out.println(ar[j]);
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
