// Java program to demonstrate 
// java.lang.Integer.toBinaryString() method 
import java.lang.Math; 
import java.util.Scanner;
class inttobin 
{ 
	// driver code 
	public static void main(String args[]) 
	{ 
		int l = 10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		l=sc.nextInt();
		// returns the string representation of the unsigned int value 
		// represented by the argument in binary (base 2) 
		System.out.println("Binary is " + Integer.toBinaryString(l)); 
		//l = 9; 
		System.out.println("Binary is " + Integer.toBinaryString(l)); 
	} 
} 