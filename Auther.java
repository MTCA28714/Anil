class Auther 
{
	String authername;
	int age;
	String place;
	Auther(String name,int age,String place)
	{
		this.authername=name;
		this.age=age;
		this.place=place;
	}
}
class Book
{
	String name;
	int price;
	Auther auther;
	Book(String n,int p,Auther auther)
	{
		this.name=n;
		this.price=p;
		this.auther=auther;
}
public static void main(String[]args)
	{
	Auther auther=new Auther("Jhon",42,"USA");
	Book b=new Book("java for begginer",800,auther);
	System.out.println("Book Name:"+b.name);
	System.out.println("Book price:"+b.price);
	System.out.println("-----Auther Details-----");
	System.out.println("Auther Name:"+b.auther.authername);
	System.out.println("Auther age:"+b.auther.age);
	System.out.println("Auther place:"+b.auther.place);
	}
}
	
	

	