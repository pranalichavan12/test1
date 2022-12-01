package lecture9;

public class DefaultConstrcter 
{
	//example:Default Constructor
	//default constructor-->provided by compiler-->same class
	//DefaultConstrcter()
	//{
		
	//}

	public void m1()
	{
		System.out.println("Running non static regular method from same class");
		
		
	}
	public static void main(String[] args)
	{
		//default constructro call from same class
		DefaultConstrcter d1=new DefaultConstrcter();
				d1.m1();
		
		//default constructor from diff class
		
		dconstructor d2=new dconstructor();
		d2.m2();
		
	}
}
