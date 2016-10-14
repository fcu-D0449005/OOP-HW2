package fcu.iecs.oop;
import java.util.Scanner ;

public class keyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.print("Please enter an integer:");
		 int integer = keyboard.nextInt();
		 System.out.print("Please enter a float point number:");
		 float number = keyboard.nextFloat();
		 System.out.print("Please enter your name:");
		 String name=keyboard.next();
		 
		 keyboard.close();
		 
		 System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e.",name,integer,number,integer*number);
	}

}
