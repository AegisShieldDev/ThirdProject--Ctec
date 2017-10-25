package stupid.controller;

public class StupidController
{
	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int d = 0;
	private int d2 = 0;
	private int e = 0;
	private int f = 0;
	private int g = 0;
	private boolean toggle = true;
	
	public void start()
	{
		while(toggle)
		{
			a = a + 1;
			System.out.print("A" + a + " ");
			
			if(a == 10)
			{
				System.out.println(" ");
				toggle = false;
			}
		}
		
		while(!toggle)
		{
			b = b + 1;
			System.out.print("B" + b + " ");
			
			if(b == 10)
			{
				System.out.println(" ");
				toggle = true;
			}
		}
		
		for(int forLoop = 0; forLoop < 10; forLoop++)
		{
			c = c + 1;
			System.out.print("C" + c + " ");
			if (forLoop == 9)
			{
				System.out.println("");
			}
		}
		for(int forLoop2 = 0; forLoop2 < 20; forLoop2 = forLoop2 + 2)
		{
			d = d + 2;
			d2 = d/2;
			System.out.print("D" + d2 + " ");
			if (forLoop2 == 18)
			{
				System.out.println("");
			}
		}
		
		String[] forEachLoop = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

		for (String forEachLoopTwo : forEachLoop) 
		{
			e = e + 1;
		    System.out.print("E" + e + " ");
		    if(e == 10)
		    {
		    		System.out.println(" ");
		    }
		}
		
		for(int forLoop3 = 0; forLoop3 < 2; forLoop3++)
		{
			for(int forLoop4 = 0; forLoop4 < 5; forLoop4++)
			{
				f = f + 1;
				System.out.print("F" + f + " ");
				if(f == 10)
				{
					System.out.println(" ");
				}
			}
		}
		String[] spanishForEachLoop = new String[] { "Uno", "Dos", "Tres", "Quatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Dies" };

		for (String spanishForEachLoopDos : spanishForEachLoop) 
		{
			g = g + 1;
		    System.out.print("G" + g + " ");
		    if(g == 10)
		    {
		    		System.out.println(" ");
		    }
		}
	}
	
}
