package TP.zadanie2;

public class RentCatalog {

	int bookID;
	int userID;
	String datarRent;
	String dataReturn;
	
	public RentCatalog(int bookID, int userID, String datarRent, String dataReturn) {
		super();
		this.bookID = bookID;
		this.userID = userID;
		this.datarRent = datarRent;
		this.dataReturn = dataReturn;
	}

	@Override
	public String toString() {
		return "RentCatalog [bookID=" + bookID + ", userID=" + userID + ", datarRent=" + datarRent + ", dataReturn="
				+ dataReturn + "]";
	}
	
	
	
	
	
	
}
