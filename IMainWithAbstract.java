abstract class IBase1
{	
	protected int l,b;
	void input(int s)
	{
			l=b=s;
	}
	abstract void input(int i,int j);
}
interface IBase2
{	
	void area();
}
interface IBase3
{
	void display();
}
class IComplete extends IBase1 implements IBase2,IBase3
{
	protected int a;
	public IComplete()
	{
		l=b=a=0;
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
class IMainWithAbstract
{
	public static void main(String dt[])
	{
		IComplete obj=new IComplete();
		obj.input(4);
		obj.area();
		obj.display();
	}	
}
