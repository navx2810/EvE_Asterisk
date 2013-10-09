package net.matt.util;

import java.util.ArrayList;

import net.matt.entity.Task;

/** This class will allow the player to see tasks he/she sets for themselves or the corp issue
 * @author Matt
 *
 */
public class JobTaskList {
	
	ArrayList<Task> taskList;
	
	/** Default Constructor | will instantiate the arrayList
	 * 
	 */
	public JobTaskList() {
		taskList = new ArrayList<Task>();
	}
	
	/** Add the task to the list
	 * @param task - the task to add
	 */
	public void add(Task task)
	{
		taskList.add(task);
	}
	
	/** Remove the task from the list
	 * @param task - the task to remove
	 */
	public void removeTask(Task task)
	{
		taskList.remove(task);
	}
}
