//Harrison Pierce
//Lab10q1

import java.util.Scanner;
import java.util.Random;
public class lab10q1
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	
	Random r = new Random();
	
	int a = r.nextInt(100);
	int b = r.nextInt(100);
	int sum = a + b;


	System.out.printf("Enter the sum of %d%n and %d%n: ", a, b);
	int num1 = input.nextInt();

	if(num1 == sum)
		System.out.println("Correct Answer!");
	else
	{
		System.out.println("Wrong answer");
		System.out.println("The correct answe is " +sum);
	}
	}
}