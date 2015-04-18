package TP.zadanie2;


public interface Iman {

	void rent(String userId,String bookId, String date );
	void renurn(String userId,String bookId, String date );
	void addBook(String title,String author,String bookid, String date );
	void removeBook(String bookid,String date, String text);
	
}

