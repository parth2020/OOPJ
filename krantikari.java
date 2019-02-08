abstract class shape
{
    //move and show
    double x,y;

    public void move(double delx,double dely)
    {
       x=x+delx;
       y=y+dely;
    }

    abstract void show();
}

class point
{
    double x=0.0;
    double y=0.0;
  
    public point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public point()
    {
      
    }

    public String show()
    {
        return "x:" +x + "y:" +y;
    }
}

class line extends shape
{
    double x1,x2,y1,y2;

    public line(point p1,point p2)
    {
        x1=p1.x;
        y1=p1.y;
        x2=p2.x;
        y2=p2.y;
      
    }

    void show()
    {
        System.out.println(""+toString());
    }

	public String toString()
        {
            return"New Line Is Created With \n \n X1 :"+x1+
                    "\n Y1 :"+y1+"\n X2 :"+x2+"\n Y2 :"+y2;
        }
}

class circle extends shape
{
    double cx1,cy1,rad;

    public circle(point c1,double r)
    {
        cx1=c1.x;
        cy1=c1.y;
        rad = r;     
    }
    
    void show() 
    {
        System.out.println(""+toString());
    }

    public String toString()
    {
        return "New Circle Is Created With \n  \n The X Cordinate Of Circle Is: "
                + cx1 +"\n The Y Cordinate Of Circle Is: " + cy1+
                  "\n And The Radius  Of Circle Is: " + rad;
    }
}

class rectengle extends shape
{
    double dx1,dy1,dx2,dy2;

    public rectengle(point dp1,point dp2)
    {
        dx1=dp1.x;
        dy1=dp1.y;
        dx2=dp2.x;
        dy2=dp2.y;
    }

    void show()
    {
        System.out.println(""+toString());
    }
    
    public String toString()
    {
        return "New Rectangle Is Created With \n \n X1 : " +dx1+ "\n Y1 : " +dy1+ "\n X2 : " +dx2+ "\n Y2 : "+dy2 ;
    }
}

public class krantikari
{

    public static void main(String[] args)
    {
        
        shape [] shape = new shape[10];
        point p1 = null, p2=null;
        
        //Line
        
        p1 = new point (100.0*Math.random(), 100.0*Math.random());
        p2 = new point (100.0*Math.random(), 100.0*Math.random());
        shape[0] = new line(p1,p2);
        shape[0].show();

        //Circle    
        
	    System.out.println("_______________________________");
	    System.out.println("");
	    p1 = new point(100.0*Math.random(),100.0*Math.random());
	    p2 = new point(100.0*Math.random(),100.0*Math.random());
	
	    shape[1] = new circle(p1,5.0*Math.random());
	    shape[1].show();
	
	    //Rectangle
	
	    System.out.println("_______________________________");
	    System.out.println("");
	    p1 = new point(100.0*Math.random(),100.0*Math.random());
	    p2 = new point(100.0*Math.random(),100.0*Math.random());
	
	    shape[2] = new rectengle(p1,p2);
	    shape[2].show();
    } 
}


