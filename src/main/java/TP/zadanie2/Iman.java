package TP.zadanie2;


public interface Iman {

	void rent(String userId,int bookId, String date );
	void returnBook(int userId,int bookId, String date );
	void addBook(int bookId,String title,String author, String date );
	void removeBook(int bookid,String date, String text);
	void addUser(int id,String firsName, String lastName, String dateIncomming);
	void removeuser(int id);
	void addStudent(String imie, String nazwisko, int nrAlbumu);
	void removeStudent(int nrAlbumu);
	void printallstudents();
	
	
}


