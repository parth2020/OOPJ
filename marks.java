public class marks
{
	public static void main(String args[])
	{
		int a=76,b=52,c=69,d=86,e=88,f=94;
		float pr;

		System.out.println("Marks of Subject 1: "+a);
		System.out.println("Marks of Subject 2: "+b);
		System.out.println("Marks of Subject 3: "+c);
		System.out.println("Marks of Subject 4: "+d);
		System.out.println("Marks of Subject 5: "+e);
		System.out.println("Marks of Subject 6: "+f);

		pr=(float)((a+b+c+d+e+f)/6.0);
		System.out.println("Student Percentage: "+pr);
	}
}