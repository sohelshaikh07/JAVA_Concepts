/*thread with synchronization method And also withn join method*/

import java.lang.*;

class Demo implements Runnable
{
	public static int c;
	public int n;
	static 
	{
		c=0;
	}
	public Demo(int num)
	{
			this.n=num;
	}
	synchronized private void count(int n)
	{
		int t=4;
		while(n!=0)
		{
			if(n%10==t)
			{
				c++;
			}
		n/=10;
		}
		String s=Thread.currentThread().getName();
System.out.println("\n The Number of 4 in the "+s+" thread is "+c);
	c=0;
	}
	
	public void run()
	{
		count(this.n);
	}
}

class threadSyncJOi
{
	public static void main(String ar[])
	{

		Demo dobj=new Demo(12345644);
		Thread t1=new Thread(dobj,"First");
		Thread t3=new Thread(dobj,"Third");
		Thread t2=new Thread(dobj,"Second");
				t2.start();
				t1.start();
				try
				{
					t2.join();
				}
				catch(Exception e){}
				t3.start();
	}
}