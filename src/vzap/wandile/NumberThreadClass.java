package vzap.wandile;

public class NumberThreadClass extends Thread
{
	private String threadName;

	public NumberThreadClass(String threadName)
	{
		this.threadName = threadName;
	}

	public String getThreadName()
	{
		return threadName;
	}
	@Override
	public void run()
	{
		try
		{
			for (int i = 100; i > 0; i -= 5)
			{
				System.out.println("\n***************" + this.getThreadName() + "*****************");
				System.out.println("i = " + i + "\n**************");
				Thread.sleep(500);
			}
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public String toString()
	{
		return "NumberThreadClass [name=" + threadName + "]";
	}
}
