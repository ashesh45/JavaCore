package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	
	public static void main(String[] args) {
		
		//subject-marks
		Map<String,Integer> map = new HashMap<>();
		 
		map.put("Maths", 88);
		map.put("Sciene", 81);
		map.put("chemistry", 87);
		
		System.out.println(map);
		
		
		System.out.println(map.get("Physis"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		
		for(String key : map.keySet()) {
		  System.out.println(key + " : " + map.get(key));
		}
		
			
		
	}

}
