//Harrison Pierce
//3/6/2017
//Assignment 3

import java.util.Scanner;

public class assignment3q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number purchased: ");
		int softpacksold = input.nextInt();

		double over10total = softpacksold * 99 * .8;
		double over20total = softpacksold * 99 * .7;
		double over50total = softpacksold * 99 * .6;
		double over100total = softpacksold * 99 * .5;

		if (softpacksold >= 100)
			System.out.printf("Purchase Total: %n" + over100total);
		else
		if (softpacksold >= 50)
			System.out.printf("Purchase Total %n" + over20total);
		else
		if (softpacksold >= 20)
			System.out.printf("Purchase Total: %n" + over50total);
		else
		if (softpacksold >= 10)
			System.out.printf("Purchase Total: %n" + over10total);

	}
}