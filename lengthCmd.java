//Getting Length of command line arguments.
//for compile javac lengthCmd.java
//for run java lengthCmd command-line-arguments

import java.util.*;

class lengthCmd
{
public static void main(String ar[])
{
 int max=0;
 for(String str:ar)//foreach loop
 {
	if(max<str.length()) 
	{
		max=str.length();
	}
 }
System.out.println("Hii");
System.out.println(max);
}

}