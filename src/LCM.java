import java.util.*;

public class LCM
{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
	int res=gcd(a,b);
	long lcm=(a*(long)b)/res;
	System.out.println(lcm);
  }
  
  public static int gcd(int a,int b)
  {
	  if(b==0)
		  return a;
	  else
		  return(gcd(b,a%b));
  }
}