import java.awt.*;
import java.awt.event.*; 
import java.lang.*;//IllegalArgumentException

class WindowClose implements WindowListener
{	
		
	public void	windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void	windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class DemoFrame 
{
public static void main(String arr[])
	{
		Frame f=new Frame("Demo Frame");
		f.setSize(400,400);
		f.setVisible(true);
		try
		{
			f.addWindowListener(new WindowClose());
		}
		catch(Exception e)
		{
	
		}	
		}
	}
}