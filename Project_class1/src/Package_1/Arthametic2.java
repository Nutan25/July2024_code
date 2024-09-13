package Package_1;

public class Arthametic2 
{
	public int Sum(int a, int b) 
	{
	int c = a+ b ;
	System.out.println("Enter the Result of Sum" +c);
	return c;
		
	}
	public int Subt(int a1, int b1) 
	{
		int c1 = a1-b1;
		System.out.println("Enter the Resulet of Sub"  +c1);
	return c1;
		
	}
	public int mul(int a2, int b2) 
	{
		int c2 = a2*b2;
	
		System.out.println("Enter the Result of Multiply"  +c2);
		return c2;
		
	}
	public int Div(int a3, int b3) 
	{
		int c3=a3/b3;
		System.out.println("Enter the Result of Div"  +c3);
		return c3;
		
	}
	public void finalrresule() 
	{
		int c4;
		System.out.println("Show the ffinal result"  +4);

	}
	
	public static void main(String[] args) 
	{
		Arthametic2 obj = new Arthametic2();
		int sumresult1 = obj.Sum(10, 2);
		int mulresult1 =obj.mul(sumresult1, 2);
		int subresult1 =obj.Subt(mulresult1, 2);
		int mulresult2 = obj.mul(subresult1, 2);
		 obj.Div(mulresult2,2);
		 
		 System.out.println("---------------------------------");
		 
		 Arthametic2 obj1 = new Arthametic2();
		 int div1 = obj1.Div(10, 2);
		 int sub1 = obj1.Subt(div1, 2);
		 int mul1 = obj1.mul(sub1, 2);
		 int sub2 = obj1.Subt(mul1,2);
		 int finalresult = obj1.Sum(sub2, 2);
		 System.out.println("the final result is =" +finalresult);
		 
		 
		 
		 
		
		
		
		
	}
}
