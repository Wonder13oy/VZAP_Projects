package vzap.wandile;

public class LettersThread implements Runnable
{
	private char [] letters;
	private String threadName;
	private Thread thread;
	
	public LettersThread(String threadName)
	{
		super();
		this.threadName = threadName;
		letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
							 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
							 'u', 'v', 'w', 'x', 'y', 'z'};
		thread = new Thread(this);
		//thread.start();
	}

	@Override
	public void run()
	{
		for (int i = 0; i < letters.length; i++)
		{
			System.out.println("\n*****************" + this.getThreadName() + "*****************");
			System.out.println(letters[i] + " ASCII value is " + (int)letters[i]);
			System.out.println("*****************************************************************");
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	
	public Thread getThread()
	{
		return thread;
	}

	public String getThreadName()
	{
		return threadName;
	}
	
}
