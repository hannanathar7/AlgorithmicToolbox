import java.util.*;
public class FibonacciNumberAgain {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int m=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=pisano(m);
		
		int l=list.size();
		
		long rem=n%l;
		
		System.out.println(list.get((int)rem));
		sc.close();
	}
	public static ArrayList pisano(int m)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int a=0;
		int b=1;
		int c=a+b;
		for(int i=0;i<m*m;i++)
		{
			c=(a+b)%m;
			list.add(a);
			a=b;
			b=c;
			if(a==0 && b==1)
				break;
		}
		return list;
	}
}
