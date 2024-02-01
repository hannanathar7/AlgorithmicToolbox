import java.util.*;
public class UnboundedKnapsack {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int n=sc.nextInt();
		int w[]=new int[n];
		int v[]=new int[n];
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			v[i]=sc.nextInt();
			
		}
		int dp[]=new int[W+1];
		dp[0]=0;
		for(int i=1;i<W+1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=w[j])
				{
					dp[i]=Math.max(dp[i],dp[i-w[j]]+v[j]);
				}
			}
		}
		System.out.println(dp[W]);
		sc.close();
	}
}
