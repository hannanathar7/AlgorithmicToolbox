import java.util.Scanner;
public class BoundedKnapsack {

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
		int dp[][]=new int[n+1][W+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<W+1;j++)
			{
				if(i==0 || j==0)
					dp[i][j]=0;
				
				else if(j>=w[i-1])
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+v[i-1]);
				}
				
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[n][W]);
		sc.close();
	}
}