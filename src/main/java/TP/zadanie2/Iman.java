package TP.zadanie2;


public interface Iman {

	void rent(String userId,String bookId, String date );
	void renurn(String userId,String bookId, String date );
	void addBook(String bookId,String title,String author, String date );
	void removeBook(String bookid,String date, String text);
	
}

