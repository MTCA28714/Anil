class Array4 
{
	public static void main(String[] args) 
	{
		int[]Numbers={2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		for(int number:Numbers)
		{
			sum+=number;
		}
		int arraylength=Numbers.length;
		average=((double)sum/(double)arraylength);
		System.out.println("sum="+sum);
		System.out.println("average="+average);
	}
}
