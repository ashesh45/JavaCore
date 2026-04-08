package bookcollection;


import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static  void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		
		Book b1 = new Book(1, "java","James ");	
		list.add(b1);
		
		Book b2 = new Book(2, "python","ashesh");
		list.add(b2);
		
		Book b3 = new Book(3,"C","bipin");
		list.add(b3);
		
		//System.out.println(list);
				
		System.out.println(list.size());
		// System.out.println(list.get(0));
		
		
	}

}
