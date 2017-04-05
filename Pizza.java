package model;

public class Pizza {

	private int pizzaId;
	private String name;
	private double price; // ne trqbva li da e double vmesto varchar, ako e varchar kak shte sumirame
	private int crustId;
	private int sizeId;
	
	public Pizza(String name, double price, int crustId, int sizeId) {
		this.name = name;
		this.price = price;
		this.crustId = crustId;
		this.sizeId = sizeId;
	} // picata da se syzdava sys vsi4ki poleta, osven id, stava li :D
	// syshto ne sym gi pravila s vytreshni klasove zashtoto s tezi getyri she stane pylna meshanica
	//pyk i nali trqbva da imame klas diagrama, koqto syshto shte se precaka

	public int getPizzaId() {
		return pizzaId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getCrustId() {
		return crustId;
	}

	public int getSizeId() {
		return sizeId;
	}
	
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
}
