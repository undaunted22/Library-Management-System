package LibraryManagementSystem;
/*Requirements
• Create a class Book, for addition of book details.
• Add required fields such as bookId, bookName, writerName, price and quantity.
• In your main code, make use of Java Collections to efficiently store the accepted book
details.
 */
public class Book 
{
	private int bookId; 
	private String bookName;
	private String writerName;
	private int price;
	private int quantity;

	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", writerName=" + writerName + ", price=" + price
				+ ", quantity=" + quantity + "]\n";
	}

	public Book(int bookId, String bookName, String writerName, int price, int quantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.writerName = writerName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	




}
