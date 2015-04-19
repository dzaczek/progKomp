package TP.zadanie2;

public class Student implements Comparable<Student> {

	 private String imie;
	 private String nazwisko;
	 private int nrAlbumu;

	 // konstruktor klasy
	 public Student(String imie, String nazwisko, int nrAlbumu) {
	  this.imie = imie;
	  this.nazwisko = nazwisko;
	  this.nrAlbumu = nrAlbumu;
	 }

	 // metoda wymagana przez interfejs Comparable<T>
	 public int compareTo(Student obiekt) {
		 // jeżeli nazwiska są takie same
		 if (nazwisko.compareTo(obiekt.nazwisko) == 0)
		  // sprawdzamy imiona
		  if(imie.compareTo(obiekt.imie) == 0)
		   // jeśli są takie same zwracamy różnicę z numerów albumu (dla takich samych będzie to zero)
		   return nrAlbumu - obiekt.nrAlbumu;
		  else
		   // w przeciwnym wypadku zwracamy porównanie imion
		   return imie.compareTo(obiekt.imie);
		 else
		  // w przeciwnym wypadku zwracamy porównanie nazwisk
		  return nazwisko.compareTo(obiekt.nazwisko);
		}

	 // metoda przesłonięta, zwraca nam tekstową reprezentację obiektu
	 public String toString() {
	  return (nazwisko + " " + imie + " " + nrAlbumu);
	 }
	 

	
	
}
