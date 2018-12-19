import java.util.Scanner

public class vovel
{
	puclic static void main(String args[])
	{
		System.out.printn("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//int l = (int)(s.length());

		int vc=0,cc=0;

		for (int i,i<s.length,i++)
		{
			char c = s.charAt(i)

			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{ vc++; }

			else
			{ cc++; }
		}
		
		System.out.println(vc+ "Are the Number Of Vovels in String");
		System.out.println(cc+ "Are the Number Of Consonent in String");
	}
}
		