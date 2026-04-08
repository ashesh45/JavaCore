package MapCollection;

import java.util.HashMap;
import java.util.Map;


public class Country {
	
	    public static void main(String[] args) {

	        Map<String, String> map = new HashMap<>();

	        map.put("Nepal", "Kathmandu");
	        map.put("India", "New Delhi");
	        map.put("Japan", "Tokyo");

                  	            
	    		for(String key : map.keySet()) {
	    			  System.out.println(key + " : " + map.get(key));
	    			}
	    			
	        }
	    }

