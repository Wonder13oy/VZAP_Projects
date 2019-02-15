package vzap.wandile;

public class HomeAffairsTesting
{
	public static void main(String [] args)
	{
		RSA_IDNumber sa1 = null;;
		try
		{
			sa1 = new RSA_IDNumber("990401-5623-www");
		}
		catch(RSA_IDNumberException TooManyCharacters)
		{
			System.out.println(TooManyCharacters.getMessage());
		}
		//System.out.println("Wandile's ID Number is: " + sa1.getIdNumber());
	}
}

