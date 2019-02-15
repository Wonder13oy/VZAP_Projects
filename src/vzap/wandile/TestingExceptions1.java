package vzap.wandile;

public class TestingExceptions1
{
	
	public static void main(String [] args)
	{
		int a = 22, b = 0;
		int answer = 0;
		
		try
		{
			answer = a / b;
		}
		catch(ArithmeticException frikkie)
		{
			System.out.println("YOU ARE AN IDIOT!");
			b = 2;
			answer = a / b;
			frikkie.getCause();
		}
		System.out.println("Answer = " + answer);
		System.out.println("Statement after the catch.....>>");
		
		int[] numbers = new int [] {1, 2, 3, 4, 5};
		try
		{
			numbers[5] = 999;
		}
		catch(ArrayIndexOutOfBoundsException frikkie)
		{
			System.out.println("YOU ARE AN IDIOT!");
			numbers [4] = 999;
			for(int item: numbers)
			{
				System.out.println("value = " + item);
			}
		}
	}
}
