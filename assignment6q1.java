//Harrison Pierce
//4/25/17
//Assignment 6
//This program displays ascii characters 0 - 127. On my computer it displays question marks for characters 1 - 32 :(

public class assignment6q1
{
	public static void main(String[] args)
	{


	for (int AsciiChar = 0; AsciiChar < 127; AsciiChar++) //This loops is to increase the count by 1 to display the char designated to that number
	{
	   System.out.print((char)AsciiChar); // AsciChar is the counter variable
		if(AsciiChar %16 == 0)
		System.out.println();	   
	}
 
	}
}