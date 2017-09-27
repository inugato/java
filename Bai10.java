import java.util.*;
public class Bai10
{	
	static double Result = 0;
	public static void main(String []args)
	{
		System.out.println("Enter X: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("Enter Y: ");
		double y = sc.nextDouble();
		for(double i=1;i<=y;i++)
		{
			Result = Math.pow(x,y);
		} 
	System.out.println("power: " +Result);
	}
}
