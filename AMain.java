abstract class ADemo
{
	private int l,b;
	protected int a;
	public ADemo()
	{
		l=b=a=0;
	}
	public void input(int s)
	{
		l=b=s;
	}
	public void input(int i,int j)
	{
		l=i;
		b=j;
	}
	public void area()
	{
		a=l*b;
	}
	abstract public void display();
}
class AComplete extends ADemo
{
	public void display()
	{
		System.out.println("Area= "+a);
	}
	public void show()
	{
		System.out.println("Thank You");
	}
}
class AMain
{
	public static void main(String dt[])
	{
		AComplete obj=new AComplete();
		obj.input(6);
		//obj.input(2,3);
		obj.area();
		obj.display();
		obj.show();
		
		ADemo obj1=new AComplete();
		obj1.input(2);
		//obj1.input(3,4);
		obj1.area();
		obj1.display();
	}
}