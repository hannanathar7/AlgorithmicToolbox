import java.util.*;
public class LongestCommonSubsequenceofTwoSequences {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		long a[]=new long[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextLong();
		int n=sc.nextInt();
		long b[]=new long[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextLong();
		long dp[][]=new long[m+1][n+1];
		for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<n+1;j++)
			{
				if(i==0 || j==0)
					dp[i][j]=0;
				
				else if(a[i-1]==b[j-1])
					dp[i][j]=1+dp[i-1][j-1];
				
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
			System.out.println(dp[m][n]);
		
		
		sc.close();
	}
}
