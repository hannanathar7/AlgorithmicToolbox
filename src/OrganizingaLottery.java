import java.util.*;
public class OrganizingaLottery {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		long a[][]=new long[s][2];
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<2;j++)
				a[i][j]=sc.nextLong();
		}
		long b[]=new long[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextLong();
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<s;j++)
			{
			if(b[i]>=a[j][0] && b[i]<=a[j][1])
				c++;
			}
			System.out.println(c);
		}
		sc.close();
	}
}
