//Harrison Pierce
//2/28/2017
//Assignment 2

import java.util.Scanner;

public class Assignment2q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int Miles;
		int Gas;
		int Milespergallon;

		System.out.printf("Enter miles driven ");
		Miles = input.nextInt();

		System.out.printf("Enter galons of Gas used ");
		Gas = input.nextInt();

		Milespergallon = Miles / Gas;

		System.out.printf("Miles-Per-Gallon: %d", + Milespergallon);
	}
}



		