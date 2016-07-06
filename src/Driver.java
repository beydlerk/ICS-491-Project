/**
 * 
 * @author Kevin Beydler, Kristin Kogasaka, Sean Baran
 *	The Driver class of our Java project.
 *
 */

//Java Porject Imports
import java.util.*; //basic functions 
import java.text.*; //text formatting directives
import java.io.*; //basic file writing/handling directives
import javax.swing.*;
import java.applet.*; //for java applet utility
import java.awt.*;

public class Driver extends Applet
{

	public static void main(String[] args) 
	{
		String username = "";
		String password = "";
		String password2 = "";
		Integer userChoice = 0;
		boolean checker = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a username:");
		username = scan.nextLine();
		
		System.out.println("Please enter a password:");
		password = scan.nextLine();
		
		System.out.println("Please re-enter your password:");
		password2 = scan.nextLine();
		if(password2 != password)
		{
		while(checker != true)
		{
			if(password2.equals(password))
			System.out.println("Sorry, but you didn't enter your password correctly the second time, please retry.");
		System.out.println("Please enter a password:");
		password = scan.nextLine();
		
		System.out.println("Please re-enter your password:");
		password2 = scan.nextLine();
		
		
		}//end while loop
		}
		
	    System.out.println("Success!");
	    System.out.println("Your username for this session is: " + username + " and your password for this session is: " + password);

	    System.out.println("If you would like to log off press 1, if you want to play, press 2.");
	    
	    while(checker = false)
	    {
	    	userChoice = scan.nextInt();
	    	checker = true;
	    if(userChoice == 1)
	    	System.exit(0);
	    else if(userChoice != 1 || userChoice != 2)
	    {
	    	System.out.println("Please enter either 1 to log off or 2 to play the game.");
	    checker = false;
	    }
	    else if(userChoice == 2)
	    {
	    	System.out.println("Proceeding to play the game!");
	    	System.out.println("Loading..."); 
	    	
	    	//Time to load the Game... The current user's username and password data fields are stored in their local variables
	    	
	    }
	    }
	    	
	}

	
}
