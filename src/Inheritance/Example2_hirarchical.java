package Inheritance;

public class Example2_hirarchical 
{
	public static void main(String[] args) 
	{
		Son3 S1=new Son3();
		S1.car();
		S1.home();
		S1.money();
		S1.bike();
		
		System.out.println("---------");
		
		Son2 S2=new Son2();
		S2.car();
		S2.home();
		S2.money();
		S2.laptop();
		
		System.out.println("---------");
		
		Son1 S3=new Son1();
		S3.car();
		S3.home();
		S3.money();
		S3.mobile();
		
	}

}
