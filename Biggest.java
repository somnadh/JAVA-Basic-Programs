import java.util.Scanner;
class Biggest
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.print("Enter A:");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		System.out.print("Enter B:");
		Scanner s1=new Scanner(System.in);
		b=s1.nextInt();
		if(a>b)
			System.out.println(a+" is biggest");
		else if(a<b)
			System.out.println(b+" is biggest");
		else if(a==b)
			System.out.println("Both are equal");	
	}
}
 
