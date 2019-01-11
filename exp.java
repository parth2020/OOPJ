public class exp
{
	public static void main(String args[])
	{
		int a[]=null;
		
		int ary_size = -1;
		int x;

		try
		{
			x=a[0];
		}

		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println(" ");
		}
		
		try
		{
			a=new int[ary_size];
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
			System.out.println(" ");
		}
	
		try
		{
			a=new int[3];
			x=a[3];
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(" ");
		}
		
		try
		{
			x=6/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(" ");
		}
	
		finally
		{
			System.out.println("Always Execute");
		}
	}
}