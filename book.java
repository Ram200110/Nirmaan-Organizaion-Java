package kishore;

public class book {
private int bookId;
private String bookName;
private String aurName;
private double bookPrice;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAurName() {
	return aurName;
}
public void setAurName(String aurName) {
	this.aurName = aurName;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "book [bookId=" + bookId + ", bookName=" + bookName + ", aurName=" + aurName + ", bookPrice=" + bookPrice
			+ "]";
}
public book(int bookId, String bookName, String aurName, double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.aurName = aurName;
	this.bookPrice = bookPrice;
}
public book() {
	super();
}
}
