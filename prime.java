public class prime
{
	public static void main(String args[])
	{
		int p=50,f=0,i;

		for(i=0;i<=p;i++)
		{
			if(p%1==0)
			{
				f=1;
			}
		}
	if(f==0)
	{
		System.out.println( p+" Is Prime Number");
	}
	else
	{
		
		System.out.println( p+" Is Not a Prime Number");
	}
	}
}