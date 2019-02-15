package vzap.wandile;

public class BaseClass extends Thread
{
	private int [] numbers = null;
	
	public BaseClass(String name)
	{
		super(name);
		numbers = new int [] {99, 88, 77, 66, 55, 44, 33, 22, 11, 00};
	}
	public int[] getNumbers()
	{
		return numbers;
	}
	public void run()
	{
		for (int i = 0; i < numbers.length; i++)
		{
			try
			{
				System.out.println("Numbers [" + i + "] = " + numbers [i]);
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
