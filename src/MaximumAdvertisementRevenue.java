import java.util.*;
public class MaximumAdvertisementRevenue {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		for(int i=0;i<n;i++)
			b[i]=sc.nextLong();
		Arrays.sort(a);
		Arrays.sort(b);
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+(a[i]*b[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}
