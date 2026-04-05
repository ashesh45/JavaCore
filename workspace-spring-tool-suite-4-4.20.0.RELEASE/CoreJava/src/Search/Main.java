package Search;

public class Main {
	
	public static void main(String[] args) {

        Searchable doc = new Document("Java is a powerful programming language");
        Searchable web = new Webpage("Learn Java programming online");

        doc.search("java");
        web.search("python");
    }

}
