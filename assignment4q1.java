//3/23/2017
//Harrison Pierce
//Assignment 4

import java.util.Scanner;
public class assignment4q1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);		

		int accountnum;
		int startbalance;
		int charges;
		int credits;
		

	System.out.print("Enter account number (or -1 to quit): ");
	accountnum = input.nextInt();

	while (accountnum > -1)
	{
		System.out.print("Enter Balance: ");
		startbalance = input.nextInt();

		System.out.print("Enter Charges: ");
		charges = input.nextInt();

		System.out.print("Enter Credits: ");
		credits = input.nextInt();

	}
	}
}
