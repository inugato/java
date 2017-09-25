import java.util.*;
public class Bai5 
{
	static float Sum =0;
	public static void main(String []args)
	{
	   System.out.println("Enter Number: ");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	  for(float i=1;i<=n;i++)
	  {
	    Sum = Sum + 1/(2*i+1);
	  }
	System.out.println("Sum: " +Sum);
        }
}
