import java.util.Scanner;


class Indexout extends Exception
{
    Indexout(String s)
    {
        super(s);
    }
}
class Dividezero extends Exception
{
    Dividezero(String s)
    {
        super(s);
    }
}
public class rauflala {

    public int divide(int a[],int inx) throws Dividezero,Indexout
    {
        int n=0,d=0,an=0;
        try
        {
            n=inx;
            d=inx+1;
            an=inx+2;
            a[an]=a[n]/a[d];          
        }
        catch(ArithmeticException e)
                {
                    System.out.println("arithmetic eception in method");
                    throw new Dividezero("change denominator in main function");
                }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound Exception in divide method");
            throw new Indexout("chang index in main method"); 
        }
        return an;
    }
   
    public static void main(String[] args) {
       
        int inx=0;
        int a[]= {1,2,3};
        rauflala obj = new rauflala();
        char t;
                do
                {
            int ch = 0;
                    System.out.println("enter your choice");
                    Scanner sc=new Scanner(System.in);
                    ch=sc.nextInt();
                    try
                    {
                    switch(ch)
                    {
                        case 1:
                            inx=0;
                            break;
                        case 2:
                            inx=1;
                            break;
                        case 3:
                            inx=-1;
                            break;
                    }
                    System.out.println("ans="+obj.divide(a, inx));
                }
                    catch(Indexout e)
                    {
                        System.out.println("arithmetic exception in main method");
                        System.out.println(e.getMessage());
                       
                    }
                    catch(Dividezero e)
                    {
                        System.out.println("array size out of bound exception in main method");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("if you do not want to exit then press y or Yotherwise press any key");
                  t=sc.next().charAt(0);
                }
			while(t!='Y'|| t!='y');
   
}
}