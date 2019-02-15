package vzap.wandile;

public class Bolt implements Runnable
{
	private int raceDistance;
	private double time;
	private String name;
	private EasyIn input;
	private Thread thread;
	
	public Bolt(String name, int raceDistance, String threadName)
	{
		this.name = name;
		this.raceDistance = raceDistance;
		time = 0.0;
		input = new EasyIn();
		thread = new Thread(this, threadName);
	}
	
	public int getRaceDistance()
	{
		return raceDistance;
	}

	public void setRaceDistance(int raceDistance)
	{
		this.raceDistance = raceDistance;
	}

	public double getTime()
	{
		return time;
	}

	public void setTime(double time)
	{
		this.time = time;
	}
	
	public Thread getThread()
	{
		return thread;
	}

	@Override
	public void run()
	{
		try
		{
			for (int i = this.getRaceDistance(); i >= 0; i -= 10)
			{
				time = (Math.random() * 6 + 5);
				System.out.println("Athlete: " + thread.getName());
				System.out.println(name + " ran the 100m in: " + time);
				System.out.println("Still has " + i + "m to go");
			}
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
