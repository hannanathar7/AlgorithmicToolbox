import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MaximumValueoftheExpression{
  public static long evaluate(long a,long b,char op) {
    if (op == '*') {
      return a * b;
    } else if (op == '+') {
      return a + b;
    } else if (op == '-') {
      return a - b;
    }
    else
      return -1;
  }

  public static long get_Max(String s)
  {
    int len=s.length();
    int digit_n = (len + 1) / 2;
    long minarr[][]=new long[digit_n][digit_n];
    long maxarr[][]=new long[digit_n][digit_n];
    for (int i = 0; i <digit_n; i++)
    {
      //The values on the main diagonal is just the number themselves
      minarr[i][i] = Integer.parseInt(s.substring(2*i,2*i+1));
      maxarr[i][i] = Integer.parseInt(s.substring(2*i,2*i+1));
    }

    for (int k = 0; k < digit_n - 1; k++)
    {
      for (int i = 0; i < digit_n - k - 1; i++) {
        int j = i + k + 1;
        long  minVal = Long.MAX_VALUE;
        long  maxVal = Long.MIN_VALUE;
        for (int h = i; h < j; h++ )
        {
           long a = evaluate(minarr[i][h],minarr[h + 1][j],s.charAt(2 * h + 1));
           long b = evaluate(minarr[i][h],maxarr[h + 1][j],s.charAt(2 * h + 1));
          long c = evaluate(maxarr[i][h],minarr[h + 1][j],s.charAt(2 * h + 1));
           long d = evaluate(maxarr[i][h],maxarr[h + 1][j],s.charAt(2 * h + 1));
          minVal = Math.min(minVal,Math.min(a,Math.min(b,Math.min(c,d))));
          maxVal = Math.max(maxVal,Math.max(a,Math.max(b,Math.max(c,d))));
        }
        minarr[i][j] = minVal;
        maxarr[i][j] = maxVal;

      }

    }
    return maxarr[0][digit_n - 1];

  }


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    System.out.println(get_Max(s));
  }
}