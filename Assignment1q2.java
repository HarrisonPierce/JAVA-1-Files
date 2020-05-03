//Harrison Pierce
//6/1/2017
//Assignment 1
import java.util.Scanner;
public class Assignment1q2
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);

	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int largest;
	int smallest;

	System.out.println("Enter first number: ");
	num1 = input.nextInt();

	smallest = num1;
	largest = num1;

	System.out.println("Enter second number: ");
	num2 = input.nextInt();

	if(num2 > largest)
	num2 = largest;
	if(num2 < smallest)
	num2 = smallest;		

	System.out.println("Enter third number: ");
	num3 = input.nextInt();

	if(num3 > largest)
	num3 = largest;
	if(num3 < smallest)
	num3 = smallest;

	System.out.println("Enter fourth number: ");
	num4 = input.nextInt();

	if(num4 > largest)
	num2 = largest;
	if(num4 < smallest)
	num4 = smallest;

	System.out.println("Enter fifth number: ");
	num5 = input.nextInt();
	
	if(num5 > largest)
	num5 = largest;
	if(num5 < smallest)
	num5 = smallest;

		System.out.printf("%d is the smallest", smallest);
		System.out.printf("%d is the largest", largest);

	}
}
