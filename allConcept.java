import  java.lang.*;
import  staticconcept.static1;

import  finalConcept.finalC;


abstract class abstract1
{
	abstract void method();
}
class abstractInherit extends abstract1
{
		void method()
		{
			System.out.println("Inside Method ");
		}
}

class allConcept
{
	public static void main(String []arg)
	{
		/*Implementation Of Static Concept;
		static1 st1=new static1();
		st1.staticMethod();
		st1.nonstaticMethod();
		
		static1 st2=new static1(10);
		st2.staticMethod();
		st2.nonstaticMethod();
		st2.j++;
		System.out.println(st2.j);


//abstract concepts

		abstract1	ob1=new abstractInherit();
		ob1.method();
	*/
	
	// Final Concept
	
		finalC fc=new finalC();
	fc.show();
	System.out.println(fc.f);
	
	
	}
}