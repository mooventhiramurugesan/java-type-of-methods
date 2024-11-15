package returntypewitharguments;

public class Statement 
{
	public String NewtonLaw(String b)
	{
		String a="Newton's third law";
		return a+b;
	}
	public static void main(String[]args)
	{
		Statement OBJ2=new Statement();
		System.out.println(OBJ2.NewtonLaw( "For every action, there is an "
				+ "equal and opposite reaction."));
	}

}
