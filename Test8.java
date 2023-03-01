class MyDate
{
	public int day;
	private int month;
	 private int year;
	public int get_month()
	{
		return month;
	}
	public void set_month(int m)
	{
		month=m;
	}
	public int get_year()
	{
		return year;
	}
	public void set_year(int y)
	{
		year=y;
	}
}
class Test8
{
	public static void main(String args[])
	{
		MyDate ob1=new MyDate();
		ob1.day=10;
		ob1.set_month(2);
		ob1.set_year(2023);
		System.out.println(ob1.day+"-"+ob1.get_month()+"-"+ob1.get_year());
	}
}

	