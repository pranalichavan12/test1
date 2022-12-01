package lecture7;

public class example2_switch2 
{
	public static void main(String[] args) 
	{
		String inp="CD";
		switch(inp)
		{
		case "CD":
			System.out.println("Running CD code");
		break;
		
		case "CW":
			System.out.println("Running Cash Withdraw code");
		break;
		
		case "MT":
			System.out.println("Running Money Transfer code");
		break;
		
		case "BI":
			System.out.println("Running BI code");
		break;
		
		case "MS":
			System.out.println("Running MS code");
		break;
		
		default:System.out.println("Invalid Input");
		
		
		
		}
		
	}

}
