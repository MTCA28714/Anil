class Bank
{
	int getRateOfInterest()
	{
		return 0;
}
}
class SBI extends Bank
{
int getRateOfInterest()
	{
return 8;
}
}
class ICIC extends Bank
{
int getRateOfInterest()
	{
return 7;
}
}
class AXIC extends Bank
{
int getRateOfInterest()
	{
return 9;
	}
}
class Bank1
{
	public static void main(String[]args)
	{
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIC();
		System.out.println("SBI RateOfInterest:"+s.getRateOfInterest());
		System.out.println("ICIC RateOfInterest:"+s.getRateOfInterest());
		System.out.println("AXIS RateOfInterest:"+s.getRateOfInterest());
}
}