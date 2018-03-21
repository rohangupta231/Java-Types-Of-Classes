interface IBase
{
	void input(int s);
}
interface IDerived1 extends IBase
{
	void input(int i,int j);
}
interface IDerived2 extends IDerived1
{
	void area();
	void display();
}
class IComplete implements IDerived2
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
class IMainMultiLevel
{
	public static void main(String dt[])
	{
		IComplete obj=new IComplete();
		obj.input(4);
		obj.area();
		obj.display();
	}	
}
