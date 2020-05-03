//Harrison Pierce
//4/26/17
//Assignment 6
//This program prints a square with a length defined by the user with a hollow center

import java.util.Scanner;
public class assignment6q3
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	int line = 0; //This is used to keep track of how many lines have been printed

	
	System.out.print("Enter a length between 1 and 20: ");
	int length = input.nextInt(); //This variable stores the user input for the desired length of the shape
	
	while(length < 1 || length > 20) //This loop is for input validation to make sure the number entered is between 1 and 20
	{
		System.out.print("Invalid. Enter a number between 1 and 20: ");
		length = input.nextInt();
	}

	System.out.println("********");

	while(line < length - 2) //This loops until the defined length is satisfied minus the 2 for top and bottom
	{
	
	System.out.print("*");
		for(int counter = 0;counter < 6;counter++) //This loop is to print the width of the hollow center of the square
		{
		System.out.print(" ");
		}
	System.out.println("*");
	line++; //After a line is printed, this increases by one to keep track of how many lines have been printed

	}
	System.out.print("********");

	}
}