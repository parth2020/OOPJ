public class pyramid
{
	public static void main(String[]args)
	{
		int i,j,k;
		Stringstr ="Stream";
		for(i=0;i <str.length();i++)
		{
			for(j=(str.length()/2)+1;j>=i;j--)
			{
				System.out.print("");
			}

			for(k=0;k<=i;k++)
			{
				System.out.print(str.charAt(k)+"");
			}

			System.out.println();
		}
	}
}