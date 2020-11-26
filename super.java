import java.lang.*;


class Base
{
private int i;
private static int j;
static
{
	j=0;
}
public Base()
{
		j++;
		this.i=0;
		System.out.println("Default Constructor");
		show();
}
private void show()
{
System.out.println("Private Method Also Private Charesteristics : "+i+"  count : "+j);
}
}
class Derived 
{
	public int i;
	public Derived()
	{
			super();
		System.out.println("Derived Default Constructor");
	}
	public void show()
	{		
		System.out.println("public Method Show");
	}
}
class Super
{
	public static void main(String ar[])
		{
			Derived dobj1=new Derived();
		}
}