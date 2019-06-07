import java.util.Scanner;

class Prog13
{
	public static void main(String [] args)
	{
		

		String str = new String();
		Scanner s= new Scanner(System.in);
       
        System.out.println("Enter the string:");

        str = s.nextLine();

         System.out.println("Length of String is :" +str.length());

          System.out.println("Second half of the string is :" +str.substring(str.length()/2));

   

	}
}