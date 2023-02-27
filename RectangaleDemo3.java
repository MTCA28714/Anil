class Rectangale
{
	private double length;
	private double width;
	public Rectangale()
	{
		length=width=0;
	}
	public Rectangale(double l,double w)
	{
		length=l;
		width=w;
		}
	public void area()
		{
			System.out.println("Area="+(length*width));
		}
	}
	public class RectangaleDemo3
	{
		public static void main(String[]args)
	{
		Rectangale mr1=new Rectangale();
		Rectangale mr2=new Rectangale(15,22);
		mr1.area();
		mr2.area();
	}
}
		
