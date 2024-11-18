package SecondDay;

import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer>();
		
		
		for(int i=1; i<100; i++) {
			li.add(i);
		}
		System.out.println(li);
		System.out.println(li.size());
		
		List<Integer> rev_li = new LinkedList<Integer>();
		for(int j=li.size()-1; j>=0; j--) {
			rev_li.add(li.get(j));
		}
		
		System.out.println("reversed list "+rev_li);
		
	
	}
}
