public class contip
{
	public static void main(String args[])
	{
		int n=50,i,j;

		A:
		for(j=2;j<=n;j++)
		{
			for(i=2;i<=Math.sqrt(j);i++)
			{
				if(j%i==0)
				{
					continue A;
				}
			}
			System.out.println(j+" Is A Prime Number Between 2  to 50");
		}
	}
}