public class lab1
{
	public static void main(String[] args)
	{
		System.out.println ("1");
		for (int n=2; n<100; n++)
		{
			boolean count;
			count= isPrime (n);
			if (count==true)
			{
				System.out.println (n);
			}
		} 
	}
	public static boolean isPrime(int n)
	{
		for (int i=2; i<n; i++)
		{
			if (n % i==0)
			{
				return false;
			}
			
		}

		return true; 
	}
		
}