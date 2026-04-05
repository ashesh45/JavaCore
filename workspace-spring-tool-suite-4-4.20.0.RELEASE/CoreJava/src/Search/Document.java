package Search;

public class Document implements Searchable {

	
	private String text;
	
    public Document(String text) {
        this.text = text;
    }
	
	
	
	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		if (text.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword found in Document.");
        } else {
            System.out.println("Keyword NOT found in Document.");
        }
    }
	}


