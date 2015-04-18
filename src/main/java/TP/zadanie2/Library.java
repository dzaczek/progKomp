package TP.zadanie2;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Library  implements Iman 	 {
	private static List<Book> shelve=new ArrayList<Book>();
	
//	HashMap newmap=new HashMap<int,Books>();
	public void rent(String userId, String bookId, String date) {
		// TODO Auto-generated method stub
		
		
	}

	public void renurn(String userId, String bookId, String date) {
		// TODO Auto-generated method stub
		
	}

	public void addBook(String title, String author, String bookid, String date) {
		// TODO Auto-generated method stub
		shelve.add(bookid,new Book(bookId, title, author, data));
	}

	public void removeBook(String bookid, String date, String text) {
		// TODO Auto-generated method stub
		

		
	}
	
	
	

}
