public class Book{
	private String author;
	private String title;
	private String isbn;

	public Book(){

	}
	
	public Book(String author, String title, String isbn){
		this.author = author;
		this.title = title;
		thils.isbn = isbn;	
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public String getISBN(){
		return isbn;
	}

	public String toString(){
		return title + ", " + author + ", " + isbn;
	}


}