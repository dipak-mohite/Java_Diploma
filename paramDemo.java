import java.applet.*;
import java.awt.*;

public class paramDemo extends Applet
{
	public void paint(Graphics g){

	String s = getParameter("str");

	g.drawString(s,50,50);

	}

}