package Package_1;

public class Arthametic_1 
{
	public int Sum(int a, int b) 
	{
	int c = a+ b ;
	System.out.println("Enter the Result of value of Sum" +c);
	return c;
		
	}
	public int Subt(int a1, int b1) 
	{
		int c1 = a1-b1;
		System.out.println("Enter the Resulet of value of Sub"+c1);
	return c1;
		
	}
	public void mul(int a2, int b2) 
	{
		int c2 = a2*b2;
	
		System.out.println("Enter the Result of Multiply"+c2);
		
	}
	public static void main(String[] args) 
	{
		Arthametic_1 result = new Arthametic_1();
		int sumresulet = result.Sum(10, 20);
		System.out.println("the valu of the sumresult "+sumresulet);
		int subresult = result.Subt(10, 20);
		System.out.println("the valu of the subresult "+subresult);
		 result.mul(sumresulet, subresult);
		
		 
		
		
	}

}
