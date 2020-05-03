// Harrison Pierce
// 2/17/17
//Lab5

/*
Ask user for max credit
Ask user for used credit
Subtract used credit from available credit


*/
import java.util.Scanner;

public class Lab5
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter max credit");
		int maxcredit = input.nextInt();
		
		System.out.println("Enter used credit");
		int usedcredit = input.nextInt();

		int availablecredit = maxcredit - usedcredit;
		System.out.printf("available credit is %d %n", availablecredit);
	}
} 