//harrison pierce

import java.util.scanner

public class lab6q7
{

	public ststic void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed: ");
		int speed = input.nextInt();

		while(speed < 0)
		{
			System.out.println("enter a speed >= 0:);
			System.out.print("Enter speed: ");
			speed = input.nextInt();

		}

		System.out.println("Enter time: ");
		int time = input.nextInt();

		while(time < 1)
		{
			System.out.println("Enter a time > 1");
			System.out.print("Enter time: ");
			int time = input.nextInt();
		}

			System.out.println("Hour		Distance Traveled");
			System.out.print("________________________________________";
			System.out.print(time + "\t\t"