import java.util.*;
public class Bai8
{
	static float sum = 0;
	public static void main(String []args)
	{
	  System.out.println("Enter Value :");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  for(float i=0;i<n;i++)
	  {
	    sum =sum + (2*i+1)/(2*i+2);
	  }
	System.out.println("Sum: " +sum);
	}
}
