import java.lang.*;
import java.util.*;




class Calculate<T>
{
	public T Add(T no1,T no2 )
	{
		return no1;
	}
}

class Demo
{
	public static void main(String arr[])
	{				
Calculate<Integer> cobj=new <Integer> Calculate();
	int r=cobj.Add(10,20);
	System.out.println(r);


Calculate<Double> cobj2=new <Double> Calculate();
	Double r1=cobj2.Add(10.45,20.12);
	System.out.println(r1);

			
	}
}