import java.util.*;
public class MajorityElement {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		HashMap<Long,Integer> map=new HashMap<Long,Integer>();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
			{
				int v=map.get(a[i]);
				map.put(a[i],v+1);
			}
			else
				map.put(a[i],1);
		}
		for(Long z:map.keySet())
		{
			int v=map.get(z);
			if(v>(n/2))
			{
				flag=1;
				break;
			}
		}
		System.out.println(flag);
		sc.close();
	}
}
