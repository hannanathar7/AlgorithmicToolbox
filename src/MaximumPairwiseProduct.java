import java.util.*;
class MaximumPairwiseProduct
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
long a[]=new long[n];
for(int i=0;i<n;i++)
a[i]=sc.nextLong();
Arrays.sort(a);
long res=a[n-1]*a[n-2];
System.out.println(res);
sc.close();
}
}