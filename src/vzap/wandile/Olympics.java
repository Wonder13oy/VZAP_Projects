package vzap.wandile;

public class Olympics
{

	public static void main(String[] args)
	{
		Bolt b1 = new Bolt("Blake", 100, "Athlete1");
		Bolt b2 = new Bolt("Warren", 100, "Athlete2");
		Bolt b3 = new Bolt("Olivia", 100, "Athlete3");
		Bolt b4 = new Bolt("Mohammed", 100, "Athlete4");
		Bolt b5 = new Bolt("Jono", 100, "Athlete5");
		Bolt b6 = new Bolt("Jonathon", 100, "Athlete6");
		
		Bolt [] race = new Bolt[] {b1, b2, b3, b4, b5, b6};
			for (int i = 0; i < race.length; i++)
			{
				try
				{
					race[i].getThread().start();
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			try
			{
				System.out.println("In main thread");
				int count = 30;
				while(count >= 0)
				{
					System.out.println("Count in main = " + count);
					count--;
				}
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	}

}
