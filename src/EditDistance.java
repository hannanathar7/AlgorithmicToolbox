import java.util.*;
public class EditDistance {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int m=s1.length();
		int n=s2.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<m+1;i++)
		{
			for(int j=0;j<n+1;j++)
			{
				if(i==0)
					dp[i][j]=j;
				
				else if(j==0)
					dp[i][j]=i;
				
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				
				else
				{
					int min=min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
					dp[i][j]=1+min;
				}
			}
		}
		System.out.println(dp[m][n]);
		sc.close();
	}
	
	public static int min(int a,int b,int c)
	{
		int x[]=new int[3];
		x[0]=a;
		x[1]=b;
		x[2]=c;
		Arrays.sort(x);
		return x[0];
	}
}
