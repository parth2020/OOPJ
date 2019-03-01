
package parth;

import java.util.logging.Level;
import java.util.logging.Logger;

class count implements Runnable
{
    Thread mythread;
    count()
    {
        mythread = new Thread(this,"runnable thread");
        System.out.println("Child Thread Created" + mythread);
        mythread.start();
    }

    
    public void run() 
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Child Threrad Printing the Numbers");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Child Thread Run is Over");
    }
}

public class threadss 
{
    public static void main(String args[])
    {
        count cnt = new count();
        try
        {
            while(cnt.mythread.isAlive())
            {
                for (int j=10;j>=0;j--)
                {
                 System.out.println("Main Threrad Printing the Numbers");
                 Thread.sleep(1500);   
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Main Thread Interrupted");
        }
    }
}
