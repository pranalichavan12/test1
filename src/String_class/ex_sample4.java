package String_class;

public class ex_sample4 
{
	public static void main(String[] args) 
	{
		String s1="myu name is pranali";
		String[] ar=s1.split("");
		System.out.println(ar.length);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar.clone()[i]);
		}
		
	}

}
