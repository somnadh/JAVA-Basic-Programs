import java.util.*;

class Armstrong
{
	public static void main(String[] args)
	{
		int n,n1,arm=0,rem;
		System.out.println("enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		n1=n;
		while(n!=0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==n1)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
