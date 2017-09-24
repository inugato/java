import java.util.*;
public class Bai3 
{
	static float Sum=0;
	public static void main(String []args)
	{
	   System.out.println("input number: ");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
	for(float i=1;i<=n;i++)
	{
 	Sum = Sum +1/i ;
        }
	System.out.println("Sum: " +Sum);
     }
}
