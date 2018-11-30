public class sort
{
	public static void main(String args[])
	{
		int a[]={10,5,1,65,32,15};
		int i,j;
		int temp=0;
		
		for(i=0;i<6;i++)
		{
			for (j=i+1;j<6;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];	
					a[j]=temp;
				}
			}
			System.out.println("Sorted Array is: "+a[i]);	
		}
		//System.out.println("Sorted Array is: "a[i]+);
	}
}
				
						