import java.util.*;
public class MoneyChangeAgain {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int coins[]= {1,3,4};
		int dp[]=new int[money+1];
		Arrays.fill(dp,10000);
		dp[0]=0;
		for(int i=1;i<money+1;i++)
		{
			int ans=dp[i];
			for(int j=0;j<3;j++)
			{
				if(i>=coins[j])
					ans=Math.min(ans,dp[i-coins[j]]);
			}
				if(ans==1000)
					dp[i]=1000;
				else
					dp[i]=ans+1;
					

		}
		if(dp[money]==1000)
			System.out.println("-1");
		else
			System.out.println(dp[money]);
		sc.close();
	}
}
