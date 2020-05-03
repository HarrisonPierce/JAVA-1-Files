//harrison pierce
//3/1/17

import java.util.Scanner;

public class lab6q6
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("enter number ");
		int num = input.nextInt();

		int counter = 1;
		int sum = 0;

		while(counter <= num)
		{
			sum = sum + counter;
			counter = counter + 1;
		}
		System.out.printf("the sum of numbers from 1 through %d is %d: %n", num, sum);
	}
}