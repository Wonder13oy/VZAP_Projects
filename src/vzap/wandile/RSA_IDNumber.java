package vzap.wandile;

public class RSA_IDNumber
{
	private String idNumber = null;
	
	public RSA_IDNumber(String saID) throws RSA_IDNumberException
	{
		if(saID.length() > 15 || saID.length() < 15)
		{
//			System.out.println("Idiot. The ID number cannot be greater than or less than 15 characters.");
//			System.out.println("Program Quitting...>>>");
//			System.exit(0);
			throw new RSA_IDNumberException("YOU ARE AN IDIOT. ID number cannot be greater than 15 characters.");
		}
		for(int pos = 0; pos < 6; pos++)
		{
			char ch = saID.charAt(pos);
			if(!(Character.isDigit(ch)))
			{
				throw new RSA_IDNumberException("YOU ARE AN IDIOT. The first 6 characters are numeric.");
			}
		}
		if(saID.charAt(6) != '-' || saID.charAt(11) != '-')
		{
			throw new RSA_IDNumberException("YOU ARE AN IDIOT. Characters at position 6 and 11 must be HYPENS.");
		}
		for(int pos = 7; pos < 11; pos++)
		{
			char ch = saID.charAt(pos);
			if(!(Character.isDigit(ch)))
			{
				throw new RSA_IDNumberException("YOU ARE AN IDIOT. The second 4 characters must be numeric.");
			}
		}
		for(int pos = 12; pos < 15; pos++)
		{
			char ch = saID.charAt(pos);
			if(!(Character.isDigit(ch)))
			{
				throw new RSA_IDNumberException("YOU ARE AN IDIOT. The last 3 characters must be numeric.");
			}
		}
		idNumber = saID;
	}

	public String getIdNumber()
	{
		return idNumber;
	}
	
}
