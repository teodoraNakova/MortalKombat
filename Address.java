package model;

public class Address {

	private int addressId;
	private String name; // tova kvartal li e?
	private String street;
	private String addressNumber; // nomer na ulicata?
	private String postcode;
	private String city;
	private String phone; // tova ne trqbva li da e string vmesto int
	private String bell;
	private int floor;
	private int buildingNumber;
	private int apartmentNumber;
	private String entrance;
	private int userId;
	
	//shtom imame nezadyljitelni poleta, kak shte se syzdava obekta adres, moje bi s 
	//konstruktor sys vsi4ki poleta i proverka, ako poleto e prazno, zadai stojnost null primerno.
	//Ili konstruktor sys vsi4ki zadyljitelni poleta, i setyri za nezadyljitelnite
}
