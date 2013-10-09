package net.matt.util;

import java.util.ArrayList;

import net.matt.util.interfaces.saveable;

/**
 * This class will save and load all of the objects to a file
 * 
 * @author Matt
 * 
 */
public class AsteriskParser {

	ArrayList<saveable> saveList;

	public AsteriskParser() 
	{
		saveList = new ArrayList<saveable>();
	}
	
	public void add(saveable object) 
	{
		saveList.add(object);
	}
}
