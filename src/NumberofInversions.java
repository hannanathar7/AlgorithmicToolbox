import java.util.*;
public class NumberofInversions {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextLong();
		int c=0;
		for(int i=1;i<n;i++)
		{
			int currInd=i;
			while(currInd>0 && a[currInd]<a[currInd-1])
			{
				c++;
				long temp=a[currInd];
				a[currInd]=a[currInd-1];
				a[currInd-1]=temp;
				currInd--;
				
			}
		}
		System.out.println(c);
		sc.close();
	}
}
