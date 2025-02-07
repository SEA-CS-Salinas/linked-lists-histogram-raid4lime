//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front; // Front of node

	public HistoList( )
	{
		front = null; // No nodes to begin with
	}

	
	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
	    HistoNode current = front; // Start with front of list

	    // Looks through list to see if letter already exits
	    while(current != null) 
	    {
	         if (current.getLetter() == let) 
	         { 
                current.setLetterCount(current.getLetterCount() + 1); // If letter does exist it will add to the count and return
                return;
            }
            current = current.getNext();
        }
        front = new HistoNode(let, 1, front); // Shifts to next node
	}
	
	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
	    HistoNode current = front;
	    int count = 0; // used to track node 

	   // Used to look through node
	   while(current != null)
	   {
	        if(current.getLetter() == let)
	        {
	            return count; // If letter is found returns the count
	    }
        current = current.getNext(); // Shifts to next node
        count++; // +1 to count
	    }
	    return -1; // returns -1 if no Letter is found
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current = front; // Start of current node
		int count = 0; // Track count of current node

		// Looks through list until spot is found
		while(current != null)
		{
		    if(count == spot) 
		    {
		        return current; // if spot is found returns the current node
		    }
		    current = current.getNext(); // Shifts to next node
		    count++; // Adds to count
		}
		return null; // Returns null if out of bounds
	}

	//returns a string will all values from list
	public String toString()
	{

		String output = " "; 
		HistoNode current = front;

		// As long as the node isn't empty it will keep iterating, used to print out the sample output
		while(current != null)
		{
		    output += current.getLetter() + " - "  + current.getLetterCount()+ "  "; // Formating
		    current = current.getNext(); // Shifts to next node
		}
		return output; // Returns the String
	}
}
