package net.matt.util.asteroid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import net.matt.entity.Asteroid;
import net.matt.entity.AsteroidEntry;

public class AsteroidAggregator {
	
	ArrayList<AsteroidEntry> asteroidCollection;
	
	/**
	 * Default Constructor | will instantiate the arrayList.
	 */
	public AsteroidAggregator()
	{
		asteroidCollection = new ArrayList<AsteroidEntry>();
	}
	
	/** Add an Asteroid to the list with the date included
	 * @param asteroid - the name of the asteroid
	 * @param date - the date the asteroid was added
	 */
	public void addAsteroidToList(Asteroid asteroid, GregorianCalendar date)
	{
		asteroidCollection.add(new AsteroidEntry(asteroid, date));
	}
	
	/** Add an Asteroid to the list
	 * @param asteroid - the asteroid to add
	 */
	public void addAsteroidToList(Asteroid asteroid)
	{
		asteroidCollection.add(new AsteroidEntry(asteroid));
	}
	
	/** Loading Asteroid List Method | This will load the asteroid list from a file
	 * @param dataFile - the file the asteroidCollection is located in
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public void loadAsteroidList(File dataFile) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dataFile));
		asteroidCollection = (ArrayList<AsteroidEntry>) inputStream.readObject();
		inputStream.close();
	}
	
	/** Saving Asteroid List Method | This will save the asteroid list to a file
	 * @param fileName - the fileName to save the file as
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void saveAsteroidList(String fileName) throws FileNotFoundException, IOException
	{
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
		outputStream.writeObject(asteroidCollection);
		outputStream.close();
		
		
	}
}
