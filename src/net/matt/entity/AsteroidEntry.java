package net.matt.entity;

import java.util.GregorianCalendar;

public class AsteroidEntry {

	Asteroid asteroid;
	GregorianCalendar date;
	
	public AsteroidEntry(Asteroid asteroid, GregorianCalendar date) {
		this.asteroid = asteroid;
		this.date = date;
	}

	public AsteroidEntry(Asteroid asteroid) {
		this.asteroid = asteroid;
		date = new GregorianCalendar();
	}
	
	public Asteroid getAsteroid() {
		return asteroid;
	}
	
	public GregorianCalendar getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		// TODO output - [Asteroid Name] - $price | [date/date/date]
		return super.toString();
	}

	
}
