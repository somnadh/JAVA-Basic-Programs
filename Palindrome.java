import java.util.*;

class Palindrome
{
	public static void main(String[] args)
	{
		int n,n1,rev=0,rem=0;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		n1=n;		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;				
		}
		if(n1==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}

