package vzap.wandile;

public class TestMain2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass("Frikkie");
		System.out.println(bc.getName());
		bc.start();
		
		Subclass sc = new Subclass();
		sc.start();//This can call start bcoz it is inherited
		sc.getName();
		
		for (int i = 0; i < 30; i++)
		{			
			try
			{
				System.out.println("In the main thread i = " + i);
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
