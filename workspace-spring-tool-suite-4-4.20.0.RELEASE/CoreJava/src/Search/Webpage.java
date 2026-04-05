package Search;

public class Webpage implements Searchable {
	
	private String content;
	

    public Webpage(String content) {
        this.content = content;
    }

	@Override
	public void search(String keyword) {
		
		// TODO Auto-generated method stub
		if (content.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword found in WebPage.");
        } else {
            System.out.println("Keyword NOT found in WebPage.");
        }
    }
	}


