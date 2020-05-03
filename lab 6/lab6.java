// Harrison Pierce
// 2/17/17
//Lab5

import java.util.Scanner;

public class lab6
{
	public static void main(String [] args)
	{
	
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Sale Amount");
		Int sale = input.nextInt();

		if(sale <= 9999)
		sale = .1 * sale;
		else if(sale <=15000)
		sale = .15 * sale;
			



	
	}
}