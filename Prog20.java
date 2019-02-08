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
            return"A New Line Is Created With\n X1 : "+x1+
                    "\n Y1 :"+y1+"\n X2:"+x2+"\n Y2 :"+y2;
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
    
    void show() {
        System.out.println(""+toString());
    }
    public String toString()
    {
        return "New Circle Is Created , \n The X Cordinate Of Is: "
                + "circle :"+ cx1 +"\n Y Cordinate Of Circle "+ cy1+ ""
                 + "\n And The Radius Of Circle Ss :" + rad;
    }
}
public class Prog20
{

  
    public static void main(String[] args)
    {
        shape [] shape = new shape[10];
        point p1 = null, p2=null;
        p1 = new point (100.0*Math.random(), 100.0*Math.random());
        p2 = new point (100.0*Math.random(), 100.0*Math.random());
        shape[0] = new line(p1,p2);
        shape[0].show();

	System.out.println("_______________________________");
	p1 = new Point(100.0*Math.random(),100.0*Math.random());
	p2 = new Point(100.0*Math.random(),100.0*Math.random());
	
	shape[1] = new circle(pl,5.0*Math.random());
	shape[1].show();
	
      
    } 
}


