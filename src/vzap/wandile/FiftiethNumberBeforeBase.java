package vzap.wandile;

public class FiftiethNumberBeforeBase implements Runnable
{
	private int fifty = 50;
	private double [] incomingNumber;
	
	public FiftiethNumberBeforeBase(double [] incomingNumber)
	{
		this.incomingNumber = incomingNumber;
	}

	@Override
	public void run()
	{		
		for (int i = 0; i < incomingNumber.length; i++)
		{
			System.out.println("Random Number = " + incomingNumber[i]);
			incomingNumber[i] -= fifty;
			System.out.println("Number minus 50 = " + incomingNumber[i]);
			try
			{
				Thread.sleep(3000);
			} catch (InterruptedException e)
			{
				e.getStackTrace();
			}
		}
	}

}
