//Harrison Pierce
//2/28/17
//Assignment 2 Question 3

import java.util.Scanner;

public class Assignment2q3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double meal;
		double taxrate = 0.0675;
		double tiprate = 0.15;
		double mealandtax;

		System.out.printf("Enter Charge for meal: ");
		meal = input.nextInt();
		
		double tax = taxrate * meal;
		double tip = (tax + meal) * tiprate;
		double mealtotal = tax + tip + meal;
		

		System.out.printf("Meal Price: %s", + meal);
		System.out.println();
		System.out.printf("Price of tip: %s", + tip);
		System.out.println();
		System.out.printf("Price of tax: %s", + tax);
		System.out.println();
		System.out.printf("Total Bill: %s", + mealtotal);
	}
}