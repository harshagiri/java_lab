package lab_programs;

public class Prg3 {

	public static void main(String args[])
	{
		try
		{
			//int val = 0; //statement1
			//int m = 100 / val; //statement2
			int []x = new int[-5]; //statement3
			System.out.println("No output");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e);
		}
		finally
		{
			System.out.println("Program end");
			System.out.println("Bye bye...");
		}
	}

}
