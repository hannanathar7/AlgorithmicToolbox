import java.util.*;
public class BinarySearch {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		int k=sc.nextInt();
		long b[]=new long[k];
		for(int i=0;i<k;i++)
			b[i]=sc.nextLong();
		int low=0;
		int high=n-1;
		for(int i=0;i<k;i++)
		{
		int res=binarysearch(a,low,high,b[i]);
		System.out.println(res);
		}
		
		sc.close();
	}
	
	public static int binarysearch(long a[],int low,int high,long item)
	{
		int mid=low+(high-low)/2;
		while(low<=high)
		{
			if(item>a[mid])
				low=mid+1;
			else if(item<a[mid])
				high=mid-1;
			else if(item==a[mid])
				return mid;
			
		}
		return -1;
	}
}
