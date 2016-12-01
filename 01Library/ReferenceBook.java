public class ReferenceBook extends LibraryBook{
	private String collection;

	public ReferenceBook(String author, String title, String isbn, String callNumber, String collection){
		super(author, title, isbn, callNumber);
		this.collection = collection;
	}

	public String getCollection(){
		return collection;
	}

	public void setCollection(String collection){
		this.collection = collection;
	}

	public void checkout(String patron, String due){
		System.out.println(new IllegalStateException("Cannot check out a reference book"));
	}

	public void returned(){
		System.out.println(new IllegalStateException("reference book could not have been check out -- return impossible"));
	}

	public String circulationStatus(){
		return "non-circulating reference book";
	}

	public String toString(){
		return super.toString() + ", " + collection;
	}

	public static void main(String[] args){
		ReferenceBook a = new ReferenceBook("bob", "bill", "343", "034", "names");
		ReferenceBook b = new ReferenceBook("bob", "bill", "343", "035", "names");
		System.out.println(a.compareTo(b));
		System.out.println(a.toString());
	}
}