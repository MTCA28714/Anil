import java.util.*;
public class Programtriangle
{
 public static void main(String[]args)
	{
		float b,h,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base and height:");
		b=sc.nextInt();
		h=sc.nextInt();
		area=(b*h)/2;
		System.out.println("Area of triangle:"+area);
	}
}