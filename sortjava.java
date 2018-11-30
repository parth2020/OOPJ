import java.util.Arrays;

public class sortjava
{
	public static void main(String args[])
	{
		int a[]={10,5,1,65,32,15};
		int i;
		
		Arrays.sort(a);

		
		for(i=0;i<6;i++)
		{
			System.out.println("Sorted Arrray is: "+a[i]);		
		}
	}
}			