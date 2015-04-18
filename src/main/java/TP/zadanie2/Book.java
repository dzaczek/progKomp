package TP.zadanie2;

public class Book  {
	
	String bookId;
	String title;
	String author;
	String data;
	int coutnOfRents = 0;
	
	public Book(String bookId, String title, String author, String data){
	
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.data=data;
		
				
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", data=" + data
				+ ", coutnOfRents=" + coutnOfRents + "]";
	}
	
	
	
	
	//test8

}	