import java.util.*;
class PrimeNot
{
	public static void main(String[] args)
	{
		int n,i,j;
		System.out.println("Enter Number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("not prime");
	}
}
