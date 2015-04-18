package TP.zadanie2;

import java.util.Arrays;

public class Users {
	
	int id;
	String firsName;
	String lastName;
	
	
	String dateIncomming;
	String dateLastRentBook;
    int[] booksrents;
    
    
    
    
	public Users(int id, String firsName, String lastName, String dateIncomming, String dateLastRentBook,
			int[] booksrents) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.dateIncomming = dateIncomming;
		this.dateLastRentBook = dateLastRentBook;
		this.booksrents = booksrents;
	}


	public int[] bookrents() {
	return this.booksrents;
	}
	public String bookrentstring() {
		return Arrays.toString(this.booksrents);
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firsName=" + firsName + ", lastName=" + lastName + ", dateIncomming="
				+ dateIncomming + ", dateLastRentBook=" + dateLastRentBook + ", booksrents="
				+ Arrays.toString(booksrents) + "]";
	}
	
    
    
    
}
