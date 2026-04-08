package bookcollection;

public class Book {

	
	private int id;
	private String bookname;
	private String bookauthor;
	
	
	 public Book(int id, String bookname, String bookauthor) {
	        this.id = id;
	        this.bookname = bookname;
	        this.bookauthor = bookauthor;
	    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
	
	
	
	
	
	
}
