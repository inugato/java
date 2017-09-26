import java.util.*;

public class Bai6
{
	static float sum = 0;
	public static void main(String []args)
	{
	    int n;
	    System.out.println("Enter Value: ");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    for(float i=1;i<=n;i++)
	    {
		sum = sum + 1/(i*(i+1)) ;
	    }
	System.out.println("Sum: " +sum);
	}
}
