import java.util.*;

public class Fibonacci {
	
  
  public static void main(String args[]) {
	  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	long a[]=new long[46];
	a[0]=0;
	a[1]=1;
	for(int i=2;i<46;i++)
	{
		a[i]=a[i-1]+a[i-2];
	}
	System.out.println(a[n]);
  }
}
