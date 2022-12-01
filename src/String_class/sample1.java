package String_class;

public class sample1 
{
	public static void main(String[] args) 
	{
	    //only declaratrion
		String s1;
		
		//string declaration & initrializatrion
		String s2="abc";
		
		System.out.println("------------------");
		String s3="ab";
		System.out.println(s3);
		s3=s3+"cd";     //ab+cd=abcd
		System.out.println(s3);
		s3=s3+"xyz";      //abcd+xyz=abcdxyz
		System.out.println(s3);
		
	}

}
