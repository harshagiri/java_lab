package lab_programs;

public class Prg2 {
	public static void main(String args[])
	{
		int x = 56;
		int y = 0;
		try
		{
			int z = x/y;
			System.out.println("Value: "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("getMessage:-");
			System.out.println(e.getMessage());
			System.out.println("\nprintStackTrace:-");
			e.printStackTrace();
			System.out.println("\ntoString:-");
			System.out.println(e.toString());
			System.out.println("\nReferring object:-");
			System.out.println(e);
		}
		System.out.println("\nEnd of program...");
	}

}
