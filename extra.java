class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
	
}

class extra
{
	public static void main(String args[])
	{

		try
		{
			throw new MyException("Ohh La La");
		}

		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}