import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "radio.class" width="400" height="200">
</applet>
*/

public class radio extends Applet implements ItemListener
{
	Label l1,l2;
	Checkbox ck1,ck2,ck3,ck4;
	CheckboxGroup cb;
	
	public void init()
	{
		l1 = new Label("Gender");
		l2 = new Label("Hobby");
		cb = new CheckboxGroup();
		ck1 = new Checkbox("Male",cb,false);
		ck2 = new Checkbox("Female",cb,false);
		ck3 = new Checkbox("Coding");
		ck4 = new Checkbox("PUBG");
		
		add(l1);
		add(ck1);
		add(ck2);
		add(l2);
		add(ck3);
		add(ck4);
		
		ck1.addItemListener(this);
		ck2.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent i)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		if(cb.getSelectedCheckbox()!=null)
		{
			g.drawString("Your Gender is : "+ cb.getSelectedCheckbox().getLabel(),10,200);
		}
	}
}

	