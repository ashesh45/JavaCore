package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static  void main(String[] args) {
		
		
		List<String> list = new ArrayList();
		
		list.add("java");
		list.add("python");
		list.add("book");
		list.add("laptop");
		
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
		System.out.println(list.size());
	 list.remove("python");
	 System.out.println(list);
		
	 System.out.println(list.contains("c++"));
	 
	 System.out.println(list.get(1));
	 list.clear();
	 
	 System.out.println(list);
	 
	 
	 
	}

}
