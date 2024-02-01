
import java.util.*;

public class MaximumValueoftheLoot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        double sum=0.0;
        double a[][]=new double[n][3];
        for(int i=0;i<n;i++)
        {
        	a[i][0]=sc.nextInt();
        	a[i][1]=sc.nextInt();
        	a[i][2]=(a[i][0]*1.0)/a[i][1];
        }
        double b[][]=sort(a,2);
        
        
        for(int i=0;i<n;i++)
        {
        	if(b[i][1]>w) {
        		sum=sum+(b[i][2]*w);
        		w=0;
        	}
        	else
        	{
        		sum=sum+(b[i][2]*b[i][1]);
        		w=(int) (w-b[i][1]);
        	}
        	if(w<=0)
        		break;
        }

        System.out.format("%.4f",sum);
        sc.close();
    }
    
    public static double[][] sort(double a[][],int col)
    {
    	Arrays.sort(a,new Comparator <double[]>() {
    		
    		public int compare(final double[] entry1, final double[] entry2) {
    			if (entry1[col] < entry2[col]) 
                    return 1; 
                else
                    return -1; 
              } 
            }); 
    	return a;	
    }
    
}