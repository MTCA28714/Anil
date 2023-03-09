class Animal 
{
	void eat()
	{
		System.out.println("eating--");
}
}
class Dog extends Animal
{
	void bark()
	{
System.out.println("eating bread--");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
class Testsuper3
{
public static void main(String[]args)
	{
		Dog d=new Dog();
		d.work();
}
}

