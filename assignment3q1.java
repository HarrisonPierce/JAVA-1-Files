//Harrison Pierce
//3/6/2017
//Assignment 3

import java.util.Scanner;

public class assignment3q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double height;
		double weight;

		System.out.println("Enter Height in inches: ");
		height = input.nextInt();
		System.out.println("Enter Weight in Lbs: ");
		weight = input.nextInt();
		
		double BMI = weight * 703 / (height * height);

		System.out.printf("Your BMI is %n" + BMI);
		System.out.println();
		if (BMI < 18.5)
			System.out.print("You are underweight");
		else
		if (BMI <= 25)
			System.out.print("You have optimal weight");
		else
		if (BMI > 25)
			System.out.print("You are overweight");

	}
}