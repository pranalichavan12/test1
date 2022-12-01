package SuperClass;

public class supercl2 extends supercl1
{
   //int a=10; global variable from super class
	int a=20;  //global variable
	
	public void m1()
	{
		int a=30;  //Local Variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		
	}

}
