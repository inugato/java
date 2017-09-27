import java.util.*;
public class Bai9
{
	static int sum = 1;
	public static void main(String []args)
	{
		System.out.println("Enter Value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum = sum * i;
		}
		System.out.println("Sum: " +sum);
	}
}
