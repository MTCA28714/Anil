class Vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
	class Bike21 extends Vehicle
	{
		void run()
		{
			System.out.println("Bike is running safely");
		}
	public static void main(String[] args) 
	{
		Bike21 obj=new Bike21();
		obj.run();
	}
}
