import java.util.*;
public class Bai2
{
	static double Sum =0;
	public static void main(String []args)
	{
	  System.out.println("please enter number: ");	 
	  Scanner sc= new Scanner(System.in);
	  int n = sc.nextInt();
	  for(double i=1;i<=n;i++)
	  {   
	     i =Math.pow(i,2);
	     Sum= Sum+i;
	  }
	System.out.println("Sum: " +Sum);
    }
}
