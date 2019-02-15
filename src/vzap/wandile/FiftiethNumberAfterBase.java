package vzap.wandile;

public class FiftiethNumberAfterBase extends Thread
{
	private int fifty = 50;
	private double sum;
	private double [] incomingNumber;
	public FiftiethNumberAfterBase(double [] incomingNumber)
	{
		this.incomingNumber =incomingNumber;
	}
	@Override
	public void run()
	{
		for (int i = 0; i < incomingNumber.length; i++)
		{
			System.out.println("Random Number: " + incomingNumber[i]);
			incomingNumber[i] += fifty;
			System.out.println("After 50= " + incomingNumber[i]);
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
