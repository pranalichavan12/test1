package Generalization;

public class Jio implements Simcard
{
	public void sms()
	{
		System.out.println("SMS::Unlimited");
	}
	public void calling()
	{
		System.out.println("AudioCalling::100");
	}
	public void data()
	{
		System.out.println("Data::1GB");
	}
	public void newFeatureA()
	{
		System.out.println("NewFeature::A");
	}

}
