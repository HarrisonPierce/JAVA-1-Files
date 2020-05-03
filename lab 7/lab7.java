//Harrison Pierce
//2/10/2017

import java.util.scanner;

public class lab7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(system.in);
		System.out.println("enter num 1");
		
		int n1 = input.nextInt();

		int remainder = n1 % 2;
		
		if(remainder == 0)
			System.out.printf("%d is even %n", n1);
		if(remainder != 0)
			System.out.printf("%d is odd %n", n1);
