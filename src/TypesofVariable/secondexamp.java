package TypesofVariable;

public class secondexamp 
{
	//Example of static Global Variable
	
	static int a=10;  //static Global Varibale
	
	public static void main(String[] args) 
	{
	   //Static Global Varible call from same class
		
		System.out.println(a); //variable name
		
		System.out.println("---------");
		
		//Static Global Varible call from Diff  class
		System.out.println(sample1.b);  //classname.variablename
		
	}
	public static void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
	   System.out.println(a);	
	}
	

}
