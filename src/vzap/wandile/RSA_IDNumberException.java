package vzap.wandile;

public class RSA_IDNumberException extends Exception
{
	private String message = null;

	public RSA_IDNumberException(String message)
	{
		super();
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}	
}
