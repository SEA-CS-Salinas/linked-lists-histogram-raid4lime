v//(c) A+ Computer Science
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
	    count = 0;
	    while(front != let)
	    {
	        front = front.getNext();
	    }
	    boolean(char let == true)
	    {
	       count++; 
	    }








	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
	    if( char let == true)
	    {
	        getLetterCount();
	    }
	    else(){
		return null;
	    }
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=null;










		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";










		return output;
	}
}
