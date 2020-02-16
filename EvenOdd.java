import java.util.*;

class EvenOdd
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Enter the number:");
		Scanner s = new Scanner(System.in);
		i=s.nextInt();
		if(i%2==0)
			System.out.println(i+" is even");
		else
			System.out.println(i+" is odd");
	}
}
		
