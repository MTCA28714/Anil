import java.util.Scanner;
public class Test55
{
	public static void main(String[]args)
	{
		double x1,y1,x2,y2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x coordinates and y coordinates of a point");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		Point p=new Point(x1,y1);
		res=p.distance_from_origin();
		System.out.println("Distance of point from origin is"+res);
		System.out.println("Enter x coordinates and y coordinates of a point");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		Point q=new Point(x2,y2);
		res=p.distance_from_point(q);
		System.out.println("Distanc better point p and q is"+res);
	}
}
