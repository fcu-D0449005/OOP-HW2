package fcu.iecs.oop;
import java.util.Scanner ;


public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		 
		System.out.print("Please enter an integer:");
		 int integer = keyboard.nextInt();
		 System.out.printf("The input integer is ",integer);
		 keyboard.close();
        if(integer%2==0)
        {
       	 System.out.print("Even Number.");
        }
        else
        {
       	 System.out.print("Odd Number.");
        }

	}

}
