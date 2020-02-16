import java.util.*;

class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,n;
		System.out.println("Enter how many numbers:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==1)
			System.out.print(a+" ");
		else if(n==2)
			System.out.print(a+" "+b+" ");
		else
		{	
			System.out.print(a+" "+b+" ");				
			for(int i=3;i<=n;i++)
			{	
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
	}
}

