class StaticMethod 
{
	static void myStaticMethod()
	{
		System.out.println("static methods can be called without creating object");
}//myStaticMethod()
public void myPublicMethod()
	{
	System.out.println("public methods must be called by creating object");
	}//myPublicMethod()
	public static void main(String []args)
	{
		myStaticMethod();
		StaticMethod myobj=new StaticMethod();
		myobj.myPublicMethod();
	}//main()
}//StaticMethod
