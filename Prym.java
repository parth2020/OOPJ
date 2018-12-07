import java.util.Scanner;

public class Prym
{
	public static void main(String args[])
	{
		char c;
		
		Scanner s = new Scanner(System.in);
`		System.out.print("ENTER STRING: ");
		String str = s.nextlinr();

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = (str.length() / 2) + 1; j >= i; j--) 
			{
                		System.out.print(" ");
            		}

            		for (int k = 0; k <= i; k++) 
			{
                		System.out.print(str.charAt(k) + " ");
            		}

            		System.out.println();
        	}
	}
}