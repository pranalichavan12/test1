package lecture5;

public class sample1 
{
   public static void main(String [] args)
   {
	   Studentname("pranali");
	   Studentname("Aayudh");
	   
	   System.out.println("--------");
	   
	   studentfullname("pranali","chavan");
	   studentfullname("Aayuudh","fakade");
	   
	   System.out.println("---------");
	   
	   
	   sample2.studentinfo("pranali",03,'A',70.67f);
	   sample2.studentinfo("Aayudh",14,'A',80.50f);
	   
   }
   public static void Studentname(String name)
   {
	   System.out.println(name);
	   
   }
   public static void studentfullname(String fn,String ln)
   {
	   System.out.println(fn+ " " +ln);
   }
}
