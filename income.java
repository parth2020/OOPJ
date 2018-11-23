public class income
{
	public static void main(String args[])
	{
		double inc=500.65,tax,rs;
		int taxrs,taxpa;

		System.out.println("Your Inncome: "+inc);

		tax=(float)(inc*0.35);
		System.out.println("Tax in USD:"+tax);
	
		rs=(float)(tax*70.46);

		taxrs=(int)(rs);
		System.out.println("Tax in India Rupees:"+taxrs);
		
		taxpa=(int)((rs-taxrs)*100);
		System.out.println("Tax in India Paise:"+taxpa);
	}
}