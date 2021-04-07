package lab_programs;

public class Prg61 implements Runnable{
	String name;
	Thread t;
	
	Prg61(String tname)
	{
		name = tname;
		t = new Thread(this, name);
		System.out.println("Thread: " + t);
		t.start();
	}
	
	public void run()
	{
		try {
			for(int i = 3; i > 0; i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) { }
		System.out.println(name + " exited");
	}

}
