import java.util.*;

public class FibbonaciLastDigit {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		long a[]=new long[10000000];
		a[0]=0;
		a[1]=1;
	for(int i=2;i<10000000;i++)
	{
		a[i]=((a[i-1]+a[i-2])%10);
	}
	System.out.println(a[n]);
    }
}

