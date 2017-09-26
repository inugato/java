import java.util.*;

public class Bai7
{
	static float sum = 0;
	public static void main(String []args)
	{
	   System.out.println("Enter Value: ");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   for(float i=1;i<=n;i++)
	   {
	     sum = sum + i/(i+1);
	   }
	System.out.println("Sum: " +sum);
	}
}
