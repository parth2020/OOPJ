import java.util.Scanner;

public class pattern {

    public static void main(String[] args) 
    {

        int i, j, k;
        System.out.print("Enter Number: ");
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();

        for (i = 0; i < no; i++) 
        {

            for (j = (no / 2) + 1; j >= i; j--) 
            {
                System.out.print(" ");
            }

            for (k = 0; k <= i; k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 0; i < no; i++) 
        {
            System.out.print(" ");

            for (j = 0; j <= i; j++) 
            {
                System.out.print(" ");
            }

            for (k = no - 1; k > i; k--) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 