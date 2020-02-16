import java.util.*;
class Digits
{
	public static void main(String[] args)
	{
		int n,n1,c=0;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		n1=n;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		System.out.println("number of digits in "+n1+" is "+c);
	}
}
