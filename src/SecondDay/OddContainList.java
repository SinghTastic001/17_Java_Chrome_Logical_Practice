package SecondDay;

import java.util.ArrayList;
import java.util.List;

public class OddContainList {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		boolean oddCheck = false;
		
		for(int i=0; i<100; i++) {
			li.add(i);
		}
		
		System.out.println(li);
		
		for(int i : li) {
			if(i%2!=0) {
				oddCheck = true;
				break;
			}
			
			
		}
		if(oddCheck = true) {
			System.out.println("odd is present");
		}else {
			System.out.println("odd is not present");
		}
	
	}
}
