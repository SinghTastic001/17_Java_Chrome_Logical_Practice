package ArraysQ;

public class LowestArray {

	public static void main(String[] args) {
		
		int[] ar = {5,3,90,100,70,1};
		int min = ar[0];
		
		for(int i=1; i<ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		System.out.println(min);
	}
}
