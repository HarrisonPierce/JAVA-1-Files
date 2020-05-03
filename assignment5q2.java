//Harrison Pierce
//4/12/17
//Assignment 5 q2
//This program asks the user to enter a number between 1 and 30 and displays a number of astericks equal to the number entered.
import java.util.Scanner;
public class assignment5q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	int count = 0;		//variable count, is used to count a number of times the user has entered a number

	while(count < 5)	//this loop limits the number of times the user is asked to enter a number to 5
	{
	System.out.print("Enter a number between 1 and 30: ");
	int num = input.nextInt();				//num is the number of asterisks that will be printed

		for(int asterisk = 0;asterisk < num; asterisk++)	// this loop prints the number of requested asterisks entered by the user by comparing the variable num to asterisk until the desired amount has been reached
		{	
			System.out.print("*");
	
		}
	System.out.println(" ");	// this ensures there is a space between each line of asterisks
	
	count++;			//this adds 1 to the counter after a line as been printed
	}
	
	}
}