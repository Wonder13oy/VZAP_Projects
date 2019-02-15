package vzap.wandile;

public class Subclass extends BaseClass
{
	private String message;
	
	public Subclass()
	{
		super("Frikkie");
		message = "I am in the VZAP Java Class and I LOVE \"NULLPOINTEREXCEPTIONS\"";
	}
	
	public void run()
	{
		try
		{
			message = message.toUpperCase();
			for (int i = 0; i < message.length(); i++)
			{
				System.out.println("" + message.charAt(i));
				Thread.sleep(250);
			}
		} catch (InterruptedException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
