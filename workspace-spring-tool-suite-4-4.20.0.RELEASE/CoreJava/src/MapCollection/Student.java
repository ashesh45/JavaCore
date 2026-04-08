package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Ashesh", 2);
		map.put("Bikram", 5);
		map.put("kabin", 9);
		
		//System.out.println(map);
		
		
		System.out.println(map.get("Bikram"));
		//System.out.println(map.values());
		//System.out.println(map.keySet());
		
		
//		for(String key : map.keySet()) {
//		  System.out.println(key + " : " + map.get(key));
//		}
		
	}

}
