import java.applet.*;
import java.awt.*;

/*
<applet code = "color.class" width="400" height="200">
</applet>
*/

public class color extends Applet 
{
	public void init()
	{
		//setsize(400,200);
		setBackground(Color.green);
	}
		
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawOval(200,100,100,100);
		g.drawString("Parth",235,155);
	}
}	
	
	