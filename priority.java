package parth;

class X extends Thread
{
    public void run()
    {
        System.out.println("Thread X Started");
        for (int i=0;i<5;i++)
        {
            System.out.println("\t Value of I In Thread");
        }
        System.out.println("Thread X Finished");
    }
}

class Y extends Thread
{
    public void run()
    {
        System.out.println("Thread Y Started");
        for (int i=0;i<5;i++)
        {
            System.out.println("\t Value of I In Thread");
        }
        System.out.println("Thread Y Finished");
    }
}

class Z extends Thread
{
    public void run()
    {
        System.out.println("Thread Z Started");
        for (int i=0;i<5;i++)
        {
            System.out.println("\t Value of I In Thread");
        }
        System.out.println("Thread Z Finished");
    }
}

public class priority 
{
    public static void main(String args[])
    {
        System.out.println("Main Thread Started");
        X threadX = new X();
        Y threadY = new Y();
        Z threadZ = new Z();
        
        threadZ.setPriority(Thread.MAX_PRIORITY);
        threadY.setPriority(threadX.getPriority()+1);
        threadX.setPriority(Thread.MIN_PRIORITY);
        threadX.start();
        threadY.start();
        threadZ.start();
        
        System.out.println("Main Thread Finished");
    }
   
}
