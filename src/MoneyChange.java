import java.util.*;
public class MoneyChange {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int sum=0;
		sum=sum+m/10;
		m=m%10;
		sum=sum+m/5;
		m=m%5;
		sum=sum+m;
		System.out.println(sum);
		sc.close();
	}
}
