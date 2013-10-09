package net.matt.util;

import java.util.ArrayList;

import net.matt.entity.Task;

/** This class will allow the player to see tasks he/she sets for themselves or the corp issue
 * @author Matt
 *
 */
public class JobTaskList {
	
	ArrayList<Task> taskList;
	
	public JobTaskList() {
		taskList = new ArrayList<Task>();
	}
	
	public void add(Task task)
	{
		taskList.add(task);
	}
	
	public void removeTask(Task task)
	{
		taskList.remove(task);
	}
}
