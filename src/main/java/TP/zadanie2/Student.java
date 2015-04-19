package TP.zadanie2;

public class Student {

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
	  // zwracamy wynik porównania dwóch pól nazwisko
	  // (korzystamy z porównania dostępnego w klasie String)
	  return nazwisko.compareTo(obiekt.nazwisko);
	 }

	 // metoda przesłonięta, zwraca nam tekstową reprezentację obiektu
	 public String toString() {
	  return (nazwisko + " " + imie + " " + nrAlbumu);
	 }
	
	
}
