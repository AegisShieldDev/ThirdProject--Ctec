package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	public void start()
	{
		System.out.println("Hello? Yes, this is Wyatt.");
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("Hello! you scanned me. Say yes");
		String answer = firstScanner.nextLine();
		System.out.println("Oh yes, you typed " + answer);
	}
}
