import java.util.*;
public class MaximumSalary {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		ArrayList<String> list=new ArrayList<String>();
		String a[]=s.split(" ");
		for(int i=0;i<n;i++)
			list.add(a[i]);
		ArrayList<String> list1=sort(list);
		String res=list1.toString().replaceAll("[\\[|\\]|,|:]","").replace(" ","");
		System.out.println(res);
		sc.close();
	}
	
	public static ArrayList<String> sort(ArrayList<String> list)
	{
		Collections.sort(list, new Comparator<String>(){ 
			
			public int compare(String X, String Y) { 
		          
		        
		        String XY=X + Y; 
		          
		        
		        String YX=Y + X; 
		          
		        return XY.compareTo(YX)*-1 ;
		        // return XY.compareTo(YX) > 0 ? -1:1; 
		    } 
		    }); 
		return list;
		}
	
	
	
	}