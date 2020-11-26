import java.util.*;

class NumberGreter extends Exception
{
	public NumberGreter(String str)
	{
		super(str);
	}
}

class UserDefinedException
{
	public static void main(String ar[])
	{
		int i=10,j=11;
		
		//User Defined  Exception
		try
		{
			if(j>10)
			{
				throw new NumberGreter("Number Is Greter Than 10");
			}
		}
		catch(NumberGreter n)
		{
			System.out.println(n);
		}
	}
}