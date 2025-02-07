//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	
	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
	    HistoNode current = front;
	    
	    while(current != null) 
	    {
	         if (current.getLetter() == let) 
	         { 
                current.setLetterCount(current.getLetterCount() + 1);
                return;
            }
            current = current.getNext();
        }
        front = new HistoNode(let, 1, front);
	}
	
	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
	    HistoNode current = front;
	    int count = 0;
	    
	   while(current != null)
	   {
	        if(current.getLetter() == let)
	        {
	            return count;
	    }
        current = current.getNext();
        count++;
	    }
	    return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current = front;
		int count = 0;
		
		while(current != null)
		{
		    if(count == spot)
		    {
		        return current;
		    }
		    current = current.getNext();
		    count++;
		}
		return null;
	}

	//returns a string will all values from list
	public String toString()
	{

		String output = " ";
		HistoNode current = front;
		
		while(current != null)
		{
		    output += current.getLetter() + " - "  + current.getLetterCount()+ "  ";
		    current = current.getNext();
		}
		return output;
	}
}
