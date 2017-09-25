import java.util.*;
public class Bai4
{
	static float sum = 0;
	public static void main(String []args)
	{
	    System.out.println("Enter Number: ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(float i=1;i<=n;i++)
            {
	         sum = sum+ 1/( 2*i);
	    }
	System.out.println("Sum: " +sum);
	}
}
