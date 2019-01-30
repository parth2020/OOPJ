import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="text.class" width=250 height=200>
</applet>
*/

public class text extends Applet implements ActionListener
{
	Label l1,l2;
	
	TextField tf1,tf2;

	public  void init()
	{
		l1 = new Label("Enter Your Name: ");
		tf1 = new TextField(10);
		l2 = new Label("Enter Your Surname: ");
		tf2 = new TextField(10);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);

		tf1.addActionListener(this);
		tf2.addActionListener(this);
	}		 	

	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Your Name Is: "+tf1.getText(),10,100);
		g.drawString("Your Surname Is: "+tf2.getText(),10,150);
	}
}			