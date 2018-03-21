interface IBase
{
	void input(int s);
	void input(int i ,int j);
}
interface IDerived extends IBase
{
	void area();
	void display();
}
class IComplete implements IDerived
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
class IMainSingle
{
	public static void main(String dt[])
	{
		IComplete obj=new IComplete();
		obj.input(4);
		obj.area();
		obj.display();
	}	
}
