//Harrison Pierce
//4/12/17
//Assignment 5 Q1
// This program is designed to find the smallest of a set of numbers entered by the user

import java.util.Scanner; // import the Scanner
public class assignment5q1
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);


	System.out.print("Please input the number of integers to be entered: "); //User inputs the amount of numbers desired
	int numcount = input.nextInt();

	System.out.print("Please enter an integer: ");		//Askes user to input the first integer and is set as the initial smallest.
	int smallest = input.nextInt();
	
	for(int count = 1;count < numcount; count++) 		//for-loop to have user enter the amount of integers specified while accounting for the first integer entered, hence the counter starts at 1 instead of 0.
	{

	System.out.print("Enter an integer: ");
	int num = input.nextInt();		// this is the new number which will be compared with the the old

	if(num < smallest)			// this compares the new input with the previous smallest to determine which is the smallest
	smallest = num;

	}
		System.out.printf("The smallest integer entered is %d%n",smallest);	//Prints the smallest of the integers entered
	}
}