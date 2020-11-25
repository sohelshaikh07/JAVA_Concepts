// compile this java file as
// javac -d . Package1.java
// after this a folder gets created in our current directory
//which contains all class files.

package MyPackage1;

public class Package1
{
	int i;
	public Package1()
	{
		System.out.println("In package  1");
	}

	public void fun()
	{
		System.out.println("In Base fun");
	}
}