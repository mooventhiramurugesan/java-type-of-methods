package nonreturntypewithoutargument;

public class withoutargument
{
	public void NumberAdd()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		withoutargument OBJ=new withoutargument();
		OBJ.NumberAdd();
	}

}
