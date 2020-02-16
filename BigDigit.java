import java.util.*;

class BigDigit
{
	public static void main(String[] args)
	{
		int n,big=0,rem=0;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();		
		while(n!=0)
		{
			rem=n%10;
			if(big<rem)
				big=rem;
			n=n/10;				
		}
		System.out.println(big);
	}
}

