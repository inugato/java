import java.util.*;
public class Bai11
{
	static int n! = 0 ;  // inital value 
	public static void main()
	{
		System.out.println("Enter n: ");
		scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			n! = n! + i*(i+i);
		}
		System.out.println("n! :" +n!);
	}
}
