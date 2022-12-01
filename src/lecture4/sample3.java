package lecture4;

public class sample3 
{
  //method with parameter
	public static void main(String [] args)
	{
		addition(25,56);
		addition(89,74);
		
		System.out.println("-------");
		
		sample3 s3=new sample3();
		s3.sub(589,475);
	}
	
	//method with two parameters
	
	public static void addition(int num1,int num2)  //static regular method
	{
	 System.out.println(num1+num2);
	}
	public void sub(int num1,int num2)   //non static regular method
	{
	 System.out.println(num1+-num2);
	}
}
