package lab_programs;

public class Prg51 {
	Thread t;
	String n;
	Prg51(String name)
	{
		n = name;
		t = new Thread(name);
		System.out.println("Thread: " + t);
		t.start();
	}
	public void run()
	{
		for(int i = 3; i > 0; i--)
		{
			System.out.println("Thread: " + n);
			try {
				Thread.sleep(500);
			} catch(Exception e){ }
		}
		System.out.println("Exiting thread "+n);
	}

}
