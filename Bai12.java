import java.util.*;
public class Bai12
{	
	static double power = 0;
	static double x = 0;
	public static void main(String []args)
	{
		System.out.println("Enter X: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		for(double i=1;i<=n;i++)
		{
			power = Math.pow(x,i);
			x = x + power;
		} 
		System.out.println("Sum: ",+x);
	}
}
