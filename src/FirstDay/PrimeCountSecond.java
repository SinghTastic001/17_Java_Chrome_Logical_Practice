package FirstDay;

public class PrimeCountSecond {

	public static void main(String[] args) {
		
		int primecount = 10;
		int count = 0; 
		int i = 1;
		
		while(count<primecount) {
			int j=1;
			int pricount = 0;
			while(j<=i) {
				if(i%j==0) {
					pricount++;
				}
				j++;
			}
			
			if(pricount==2) {
				System.out.println(i);
				count++;
			}
			i++;
			
		}
	}
}
