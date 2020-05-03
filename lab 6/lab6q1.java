// Harrison Pierce
// 2/17/17
//Lab5

import java.util.Scanner;

public class lab6q1
{
	public static void main(String [] args)
	{

		Scanner Keyboard = new Scanner(System.in);

		double sales = Keyboard.nextDouble();

		double commission_rate;

		if (sales < 10000)
		commission_rate = .10;

		else if (sales <= 15000)
		commission_rate = 0.15;
		else
		commission_rate = .20;

		double commission;
		commission = sales * commission_rate;

System.out.println("commission for the sales Person is " + commission);

	}
}