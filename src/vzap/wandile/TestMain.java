package vzap.wandile;

public class TestMain
{
	public static void main(String [] args)
	{
		Thread th = Thread.currentThread();
		System.out.println(th.toString());
		th.setPriority(2);
		
		NumberThreadClass ntc_1 = new NumberThreadClass("ntc_1");
		//ntc_1.start();
		ntc_1.start();
		ntc_1.setPriority(1);
		
		ClockThread clock = new ClockThread();
		clock.getThread().start();
		clock.getThread().setPriority(10);
		
		LettersThread ltc_1 = new LettersThread("ltc_1");
		ltc_1.getThread().start();
		ltc_1.getThread().setPriority(5);
		try
		{
			for (int i = 0; i < 50; i++)
			{
				System.out.println("main i= " + i);
				Thread.sleep(3000);
			}
		} catch (InterruptedException e)
		{
			// TODO: handle exception
		}
		
		double num;
		double [] randNums = new double [10];
			for (int i = 0; i < randNums.length; i++)
			{
				num = (double)(Math.random() * 101);
				randNums[i] = num;
			}
		FiftiethNumberAfterBase noPlus50 = new FiftiethNumberAfterBase(randNums);
		noPlus50.run();
		
			for (int i = 0; i < randNums.length; i++)
			{
				num = (double)(Math.random() * 101);
				randNums[i] = num;
			}
		FiftiethNumberBeforeBase noMinus50 = new FiftiethNumberBeforeBase(randNums);
		noMinus50.run();
	}
}
