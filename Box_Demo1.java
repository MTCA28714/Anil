class Box
{
	double width;
	double height;
	double depth;
}
class Box_Demo1
{
	public static void main(String[]args)
	{
		Box mybox=new Box();
		double vol;
		mybox.width=100;
		mybox.height=200;
		mybox.depth=300;
		vol=mybox.width*mybox.height*mybox.depth;
		System.out.println("volume is"+vol);
	}
}
		
