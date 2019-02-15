package vzap.wandile;

public class TestingRecursion
{
	static long value = 0L;
	
	/*n! = n x (n - 1) x (n - 2) x ... x 2 x 1
	4! = 4 x 3 x 2 x 1 = 24*/
	
	public static void main(String[] args)
	{
		long result;
		result = TestingRecursion.factorial(4);
		System.out.println("4! = " + result);
	}
	
	public static long factorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * factorial(n - 1);
	}
}
