package fcu.iecs.oop;
import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1,n2;

		Scanner keyboard = new Scanner(System.in);
		 
		System.out.print(" enter a integer 1:");
		 n1 = keyboard.next();
		 System.out.print(" enter a integer 2:");
		 n2 = keyboard.next();
		
		 keyboard.close();
		

        if( n1.equalsIgnoreCase(n2))
        {
        	
          System.out.print("The two strings are the same.");
        }
        else
        {
        	System.out.print("The two strings are not the same.");
        }
	}

}
