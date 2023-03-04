public class Point
{
	public double x;
	public double y;
	Point()
	{
		x=0;
		y=0;
}
Point(double x1,double y1)
	{
	x=x1;
	y=y1;
	}
	public double distance_from_origin()
	{
		double dist;
		dist=Math.sqrt(x*x*+y*y);
		return dist;
	}
	public double distance_from_point(point Q)
	{
		double diff_x=x_Q.x;
		double diff_y=y_Q.y;
		return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}
	public void translats(double x_trans,double y_trans)
	{
		x=x+x_trans;
		y=y+y_trans;
	}
}
