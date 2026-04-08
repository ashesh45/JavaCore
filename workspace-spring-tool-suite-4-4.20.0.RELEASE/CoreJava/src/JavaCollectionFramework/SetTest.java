package JavaCollectionFramework;

import java.util.Set;
import java.util.*;

public class SetTest {
	
	public static void main(String[] args) {
		
		
		//Set<String> set = new Hashset<>();
		
		//Set<String> set = new Treeset<>();
		
		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("python");
		
		set.add("java");
		set.add("java");
		set.add("andriod");
		set.add("c++");
		set.add("css");
		set.add("html");
		
		
		System.out.println(set);
		
	}

}
