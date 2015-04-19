package TP.zadanie2;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Library  implements Iman 	 {
	private static List<Book> shelve=new ArrayList<Book>();
	private static List<Users> catalogIfUsers=new ArrayList<Users>();
	private static List<RentCatalog> rentCatalog=new ArrayList<RentCatalog>();
	


	public void addBook(int bookId, String title, String author, String date) {
		// TODO Auto-generated method stub
		shelve.add(new Book(bookId, title, author, date));
	}

	public void rent(int userId, int bookId, String date) {
		// TODO Auto-generated method stub
		rentCatalog.add(bookId,new RentCatalog(bookId, userId, date));
		
	}


	public void removeBook(int bookid, String date, String text) {
		
		
		// TODO Auto-generated method stub
		shelve.remove(bookid);
		
		
	}

	public void rent(String userId, int bookId, String date) {
		// TODO Auto-generated method stub
		
	}


	public void returnBook(int userId, int bookId, String date) {
		// TODO Auto-generated method stub
		
	}

    public void printAllBooks()
    {
    	//shelve.toArray();
    	
      	//System.out.println(shelve.get(0).toString() );
      	for (int i=0;i<shelve.size();i++)
      	{
      		System.out.println(shelve.get(i).toString() );	
      	}
      	
    }
	
	
	

}
