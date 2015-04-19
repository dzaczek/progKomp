package TP.zadanie2;

public class RentCatalog {

	int bookID;
	int userID;
	String datarRent;
	String dataReturn;
	
	public RentCatalog(int bookID, int userID, String datarRent) {
		super();
		this.bookID = bookID;
		this.userID = userID;
		this.datarRent = datarRent;
		
	}
	public void bookReturn(String dataReturn)
	{
		this.dataReturn = dataReturn;
	}
	
	public int bookID()
	{
		return this.bookID;
	}

	public int userID()
	{
		return this.userID;
	}

	
	
	
	@Override
	public String toString() {
		return "RentCatalog [bookID=" + bookID + ", userID=" + userID + ", datarRent=" + datarRent + ", dataReturn="
				+ dataReturn + "]";
	}
	
	
	
	
	
	
}
