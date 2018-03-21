interface IBase1
{
	void input(int s);
}
interface IBase2
{
	void input(int i,int j);
}
interface IBase3
{
	void area();
	void display();
}
class IComplete implements IBase1,IBase2,IBase3
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
		System.out.println("Area="+a);
	}
}
class IMainMultiImplementation
{
	public static void main(String dt[])
	{
		IComplete obj=new IComplete();
		obj.input(4);
		obj.area();
		obj.display();
	}	
}
