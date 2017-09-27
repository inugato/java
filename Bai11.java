import java.util.*;
public class Bai11
{
	static long factorial = 0;  // inital value 
	static long P = 1 ;
	public static void main(String []args)
	{
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(long i=1;i<=n;i++)
		{
			P = P * i;
			factorial = factorial + P;
		}
		System.out.println("n! :" +factorial);
	}
}
