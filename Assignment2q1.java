//Harrison Pierce
//2/28/2017
//Assignment 2 q1

import java.util.Scanner;

public class Assignment2q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int Purchase;
		double statetax = 0.02;
		double countytax = 0.04;
		
		
		System.out.print("Enter Purchase Amount: ");
		Purchase = input.nextInt();
		
		double PStax = Purchase * statetax;
		double PCtax = Purchase * countytax;
		double Totalprice = PCtax + PStax + Purchase;
		double Totaltax = PStax + PCtax;
		
		System.out.printf("state tax is %s", + PStax);
		System.out.println();
		System.out.printf("county tax is %s", + PCtax);
		System.out.println();	
		System.out.printf("Total Price is %s", + Totalprice);
		System.out.println();
		System.out.printf("Total tax is %s", + Totaltax);
		

	}	
}
