//Harrison Pierce
//3/29/17
//Assignment4

//The program freezes at loop. I cannot figure out why and I am out of time. Otherwise the rest should be accurate


//Set a counter = 1
//Set while loop for the number of employees that will be entered
//Ask for the hourly pay rate
//Ask for the hours worked
//Compute the pay using the formula
//Print the pay for the first employee
//Add 1 to counter and repeat loop until counter reaches the number of desired employees



import java.util.Scanner;
public class assignment4q2
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	double counter = 1;
	
	System.out.print("enter number of employees: ");
	double employees = input.nextInt();
	
	while(counter < employees);
	{
		System.out.print("Please enter hourly rate: ");
		double rate = input.nextDouble();

		System.out.print("Enter hours worked: ");
		double hour = input.nextDouble();

		double pay = (40 * rate) + (hour - 40) * (rate * 1.5);

		System.out.printf("Payment for employee %f %n: %f %n", counter, pay);
		
		counter = counter + 1;

	}
	
	}
}