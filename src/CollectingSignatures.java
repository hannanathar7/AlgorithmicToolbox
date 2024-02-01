import java.util.*;
public class CollectingSignatures {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[][]=new long[n][2];
		for(int i=0;i<n;i++)
		{
			a[i][0]=sc.nextLong();
			a[i][1]=sc.nextLong();
		}
		ArrayList<Long> list=new ArrayList<Long>();
		long arr[][]=sort(a,1);
		long val=arr[0][1];
		list.add(val);
		for(int i=1;i<n;i++)
		{
		if(val<arr[i][0])	
		{
			val=arr[i][1];
			list.add(val);
		}
		}
		System.out.println(list.size());
		System.out.println(list.toString().replaceAll("[\\[|\\]|,|:]",""));
		sc.close();
	}
	
	public static long[][] sort(long a[][],int col)
	{
		Arrays.sort(a,new Comparator <long[]>() {
    		
    		public int compare(final long[] entry1, final long[] entry2) {
    			if (entry1[col] > entry2[col]) 
                    return 1; 
                else
                    return -1; 
              } 
            }); 
    	return a;	
	}
}
