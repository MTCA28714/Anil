import java.util.*;
public class Sumofodd
{
 public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int sumodd=0;
		System.out.println("Enter 10 array elements");
		int Arr[]=new int[10];
		for(int i=0;i<Arr.length;i++)
			Arr[i]=sc.nextInt();
		for(int j=0;j<Arr.length;j++)
		{
			if(Arr[j]%2!=0)
		{
		sumodd=sumodd+Arr[j];
	}
}
System.out.println("sum of odd numbers:"+sumodd);
}
}
