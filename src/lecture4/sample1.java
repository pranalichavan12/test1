package lecture4;

public class sample1 
{
   public static void main(String [] args)
   {
	   m1();
	   sample2.m3();
	   sample1 s1=new sample1();
	   s1.m2();
	   sample2 s2=new sample2();
	   s2.m4();
   }      
   
	   
	   
	   //static Regular Method
	   public static void m1()
	   {
		   System.out.println("This is Static Regular Method");
	   }
	   //Non static Regular method
	   public void m2()
	   {
		   System.out.println("This is Non static Regular Method");
	   }

   
}
