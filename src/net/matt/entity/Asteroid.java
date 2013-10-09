package net.matt.entity;

import net.matt.util.interfaces.saveable;

public class Asteroid implements saveable {
	
	String name;
	double price;
	
	
	/** Default Constructor | Used to set an ore
	 * @param name - the name of an asteroid
	 * @param price - the price of the asteroid
	 */
	public Asteroid(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
