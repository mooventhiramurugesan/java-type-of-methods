package nonreturntypewitharguments;

public class witharguments 
{
	public void Word(String b)
	{
		String a="Welcome to java";
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		witharguments Obj2=new witharguments();
		Obj2.Word(" coding world.");
	}

}
