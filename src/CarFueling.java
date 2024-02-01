import java.util.*;
public class CarFueling {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		if(a[0]>m)
		{
			System.out.println("-1");
			sc.close();
			return;
			
		}
		int arr[]=new int[n+2];
		arr[0]=0;
		arr[n+1]=d;
		for(int i=1;i<n+1;i++)
			arr[i]=a[i-1];
		int lfuel=0,cfuel=0;
		int sum=0,flag=0;
		for(int i=1;i<n+2;i++)
		{
			if(arr[i]-arr[lfuel]>m)
			{
				i--;
				cfuel=i;
				if(arr[cfuel]==arr[lfuel])
				{
					flag=1;
					break;
				}
				lfuel=cfuel;
				sum++;
			}
			else if(arr[i]-arr[lfuel]==m)
			{
				cfuel=i;
				lfuel=cfuel;
				sum++;
			}
			
		}
		if(d==arr[lfuel])
			sum--;
		if(d-arr[lfuel]>m)
			flag=1;
		if(flag==0)
			System.out.println(sum);
		else
			System.out.println("-1");
		sc.close();
	}
}
