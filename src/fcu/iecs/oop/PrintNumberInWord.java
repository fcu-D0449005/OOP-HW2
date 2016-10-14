package fcu.iecs.oop;
import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		 System.out.print("Please enter an integer:"); 
		 int integer = keyboard.nextInt();
		 
		 System.out.printf("The input integer is ",integer);
		 keyboard.close();
       switch(integer)
       {
       case 1:
       System.out.print("\"ONE\".");
       break;
       case 2:
       System.out.print("\"TWO\".");
       break;
       case 3:
       System.out.print("\"THREE\".");
       break;
       case 4:
       System.out.print("\"FOUR\".");
       break;
       case 5:
       System.out.print("\"FIVE\".");
       break;
       case 6:
       System.out.print("\"SIX\".");
       break;
       case 7:
       System.out.print("\"SEVEN\".");
       break;
       case 8:
       System.out.print("\"EIGHT\".");
       break;
       case 9:
       System.out.print("\"NINE\".");
       break;
       default:
       	 System.out.print("\"OTHER\".");
       break;
       }
	}

}
