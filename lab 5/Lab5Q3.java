// Harrison Pierce
// 2/17/17
//Lab5

import java.util.Scanner;

public class Lab5Q3
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		double percent = 0.62;
		int totalsales = 46000000;
		double divisionsales = totalsales * percent;
		System.out.printf("Division sales is %f %n", divisionsales);
	}
}