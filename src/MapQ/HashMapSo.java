package MapQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSo {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("suman", 50);
		scores.put("swati", 40);
		scores.put("ritik",12);
		scores.put("manisha", 6);
		scores.put("priti", 30);
		
		System.out.println(scores);
		System.out.println(scores.size());
		System.out.println(scores.keySet());
		System.out.println(scores.values());
		for(Entry<String, Integer> e : scores.entrySet()) {
			System.out.println(e);
		}
	}
}
