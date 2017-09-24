import java.util.*;

public class Bai1
{
	static int S=0;
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("input number: ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		S=S+i;
	}
	System.out.println("sum is: " +S);
  }
}
