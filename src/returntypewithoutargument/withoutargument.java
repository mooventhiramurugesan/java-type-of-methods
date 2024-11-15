package returntypewithoutargument;

public class withoutargument
{
	public int sub() {
		
		int savings_amount=159999;
		int withdraw_amount=59999;
		int current_balance=savings_amount-withdraw_amount;
		
		return current_balance;
	}
	
	public static void main(String[]args)
	{
		withoutargument OBJ1=new withoutargument();
		System.out.println(OBJ1.sub());
	}

}
