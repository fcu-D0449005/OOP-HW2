package fcu.iecs.oop;
import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
				String n1,n2;
				int a=0; 
		
	   do
		{ 

	     System.out.print(" enter a integer 1:");
		 n1 = keyboard.next();
		 System.out.print(" enter a integer 2:");
		 n2 = keyboard.next();
	     a=n1.compareToIgnoreCase(n2);
	     if(a!=0)System.out.print("The two strings are not the same.\n");

		}while(a!=0);
        
      System.out.print("The two strings are the same.");
        	
 	    keyboard.close();
	 }
	
	}

