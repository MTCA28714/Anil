class Print_Stars
{
	public static void Print_multiple_stars(int i)
	{
		int k=1;
		for(;k<i;k=k+1)
			System.out.println("*");
	}
	public static void main(String[]args)
	{
		int j=5;
		Print_multiple_stars(j);
		System.out.println(" ");
	}
}
