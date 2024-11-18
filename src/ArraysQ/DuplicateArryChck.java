package ArraysQ;

public class DuplicateArryChck {

	public static void main(String[] args) {
		
		int[] ar1 = {10,20,40,50,60,7,9};
		int[] ar2 = {2,4,30,70,5};
		boolean flag = false;
		
		for(int i=0; i<ar1.length; i++) {
			for(int j=0; j<ar2.length; j++) {
				if(ar1[i]==ar2[j]) {
					flag = true;
					break;
				}
			}
		}
		if(flag==true) {
			System.out.println("Arys containe duplicate values");
		}else {
			System.out.println("Arys cannot containe duplicate vlaues");
		}

	}
}
