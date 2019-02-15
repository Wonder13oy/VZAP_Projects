package vzap.wandile;


public class TenDigitThread extends Thread
{
	private double [] numbers;
	private double min, max, avg, square, sum;
	private String threadName;
	private Thread thread;
	
	public TenDigitThread(double [] numbers)
	{
		this.numbers = numbers;
		min = numbers[0];
		max = numbers[0];

	}
	
	@Override
	public void run()
	{		
			System.out.println("******************************Results**********************************");
			for (int i = 0; i < numbers.length; i++)
			{
				if(numbers[i] < min)
				{
					min = numbers[i];
				}
				if(numbers[i] > max)
				{
					max = numbers[i];
				}
				
				sum += numbers[i];
				avg = sum / i;
			}
			try
			{
				System.out.println("Drum Roll.................>>>>");
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.getStackTrace();
			}	
			
			System.out.println("Min = " + min);
			System.out.println("Max = " + max);
			System.out.println("Average = " + avg);
					
	}
	public static void main(String [] args)
	{
		double [] numbers = new double [10];
		EasyIn input = new EasyIn();
			for (int i = 0; i < numbers.length; i++)
			{
				System.out.print("Enter a number: ");
				numbers[i] = input.readDouble();
			}
		TenDigitThread dt10 = new TenDigitThread(numbers);
		dt10.run();
	}
}
