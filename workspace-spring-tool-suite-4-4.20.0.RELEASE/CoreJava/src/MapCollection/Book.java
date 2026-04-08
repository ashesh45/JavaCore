package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class Book {
	
	public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Rich dad and poor dad", "james");
        map.put("Mahabir Pun", "gosling");
        map.put("Money", "Chamling");
        
       
            System.out.println("\n---- List of Books ----");       
    		for(String key : map.keySet()) {
    			  System.out.println(key + " : " + map.get(key));
    			}
    		
    		
    	       System.out.println("\n---- Search Book ----");
    	        String searchTitle = "Java";

    	        if (map.containsKey(searchTitle)) {
    	            System.out.println("Book: " + searchTitle + ", Author: " + map.get(searchTitle));
    	        } else {
    	            System.out.println("Book not found!");
    	        }
    	        
    	        
    	        System.out.println("\n---- Total Books ----");
    	        System.out.println("Total number of books: " + map.size());
    			
        }

}
