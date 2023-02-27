class Triangle
{
	private double base;
	private double height;
	public Triangle()
	{
		base=height=0;
	}
	public Triangle(double b,double h)
	{
		base=b;
		height=h;
		}
	public void area()
		{
			System.out.println("Area="+(base*height)/2);
		}
	}
	public class TriangleDemo2
	{
		public static void main(String[]args)
	{
		Triangle mytriangle1=new Triangle();
		Triangle mytriangle2=new Triangle(15,22);
		mytriangle1.area();
		mytriangle2.area();
	}
}
		
