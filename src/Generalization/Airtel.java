package Generalization;

public class Airtel implements Simcard
{
	public void sms()
	{
		System.out.println("SMS::700");
	}
	public void calling()
	{
		System.out.println("AudioCalling::300");
	}
	public void data()
	{
		System.out.println("Data::3GB");
	}
	public void newFeatureC()
	{
		System.out.println("NewFeature::C");
	}

}
