package lab_programs;

public class Prg52 {
	public static void main(String args[])
			throws InterruptedException
	{
		new Prg51("IND"); // statement1
		new Prg51("PAK"); // statement2
		new Prg51("SRI"); // statement3
		for(int i = 3; i > 0; i--)
		{
			System.out.println("Main Thread: " + i);
			Thread.sleep(1000); //statement4
		}
		System.out.println("Main thread exiting.");
	}

}
