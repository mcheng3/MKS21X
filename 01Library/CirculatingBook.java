public class CirculatingBook extends LibraryBook{
	private String currentHolder;
	private String dueDate;

	public CirculatingBook(String author, String title, String isbn, String callNumber){
		super(author, title, isbn, callNumber);
	}
	
	public void checkout(String patron, String due){
		currentHolder = patron;
		dueDate = due;
	}

	public void returned(){
		currentHolder = "";
		dueDate = "";
	}

	public String circulationStatus(){
		if(currentHolder.compareTo("") == 0){
			return "book available on shelves"
		}
		else return currentHolder + "    due: " + dueDate;
	}

	public String toString(){
		if(currentHolder.compareTo("") == 0){
			return super.toString();
		}
		else return super.toString() + ", " + currentHolder + ", "dueDate
	}
}