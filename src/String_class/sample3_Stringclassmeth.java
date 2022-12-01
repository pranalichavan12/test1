package String_class;

public class sample3_Stringclassmeth 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="Spider";
		String s3="Antric";
		String s4="my name is pranali";
		String s5="";
		String s6="abcdef";
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(3,6));
		System.out.println(s1+s3);
		System.out.println(s1.concat(s3));
		System.out.println(s4.replace("pranali", "Aayuudh"));
		
		System.out.println("-------------------------");
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s4.contains("is"));
		
		System.out.println("--------------------------");
		
		System.out.println(s1.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("o"));
		System.out.println(s6.lastIndexOf('a'));
		System.out.println(s6.startsWith("my"));
		System.out.println(s4.endsWith("Aayuudh"));
		
		
	}

}
