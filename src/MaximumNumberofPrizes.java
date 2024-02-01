import java.util.*;
public class MaximumNumberofPrizes {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		if(n==2)
		{
			System.out.println("1");
			System.out.println("2");
			sc.close();
			return;
		}
		HashSet<Long> set=new HashSet<Long>();
		long start=1;
		while(n!=0)
		{
			if(n-start<=start)
					{
						set.add(n);
						n=0;
					}
			else
			{
				n=n-start;
				set.add(start);
				start++;
			}
		}
		System.out.println(set.size());
		System.out.println(set.toString().replaceAll("[\\[|\\]|,|:]",""));
		sc.close();
	}
}
