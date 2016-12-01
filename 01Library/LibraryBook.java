public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	private String callNumber;

	public LibraryBook(String author, String title, String isbn, String callNumber){
		super(author, title, isbn);
		this.callNumber = callNumber;
	}

	public String getCallNumber(){
		return callNumber;
	}

	public void setCallNumber(String callNumber){
		this.callNumber = callNumber;
	}

	public abstract void checkout(String patron, String due);

	public abstract void returned();

	public abstract String circulationStatus();

	public int compareTo(LibraryBook bk){
		return callNumber.compareTo(bk.callNumber);
	}

	public String toString(){
		return super.toString() + ", " + callNumber;
	}
}