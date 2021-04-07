package lab_programs;

public class Prg62 {
	public static void main(String args[])
			throws InterruptedException
	{
		Prg61 ob1 = new 	Prg61("First");
		Prg61 ob2 = new 	Prg61("Second");
		Prg61 ob3 = new 	Prg61("Third");
		System.out.println("First Thread is alive: "
				+ ob1.t.isAlive());
		System.out.println("Second Thread is alive: "
				+ ob2.t.isAlive());
		System.out.println("Third Thread is alive: "
				+ ob3.t.isAlive());
		System.out.println("Waiting for threads to finish.");
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
		System.out.println("First Thread is alive: "
				+ ob1.t.isAlive());
		System.out.println("Second Thread is alive: "
				+ ob2.t.isAlive());
		System.out.println("Third Thread is alive: "
				+ ob3.t.isAlive());
		System.out.println("Main thread exited"); //statement1

	}
}
