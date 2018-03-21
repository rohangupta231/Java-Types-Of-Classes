interface IDemo
{
	void input(int s);
	void input(int i,int j);
	void area();
	void display();
}
class IComplete implements IDemo
{
private int l,b,a;
	public IComplete()
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
	public void display()
	{
		System.out.println("Area= "+a);
	}
	public void show()
	{
		System.out.println("Thank You");
	}
}
class IMain
{
	public static void main(String dt[])
	{
		IComplete obj=new IComplete();
		obj.input(6);
		//obj.input(2,3);
		obj.area();
		obj.display();
		obj.show();
			
		IDemo obj1=new IComplete();
		obj1.input(2);
		//obj1.input(3,4);
		obj1.area();
		obj1.display();
	}
}