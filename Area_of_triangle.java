import java.util.*;
public class Area_of_triangle
{
	static double calculateArea(double b,double h)
	{
		double temp;
		temp=1.0/2.0*b*h;
		return temp;
	}
	public static void main(String args[])
	{
		double base,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of the right angled tringal:");
		base=sc.nextDouble();
		System.out.println("Enter height of the right angled tringal:");
		height=sc.nextDouble();
		area=calculateArea(base,height);
		System.out.println("Area of tringal with base"+base+"height"+height+"is"+area+"squnits");
	}
}