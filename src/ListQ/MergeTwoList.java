package ListQ;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<Integer>();
		for(int i=1; i<10; i++) {
			System.out.println(li1.add(i));
		}
		
		List<Integer> li2 = new ArrayList<Integer>();
		for(int j= 11; j<20; j++) {
			System.out.println(li2.add(j));
		}
		
		System.out.println("list 1 "+li1);
		System.out.println("List 2 "+li2);
		
		li1.addAll(li2);
		System.out.println("list1 "+li1);
		
		
		
//		make third list 
		
		List<Integer> mergeList = new ArrayList<Integer>(li1);
		mergeList.addAll(li2);
		System.out.println("merge list "+mergeList);
	}
}
