import java.util.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        in.close();
        for(int v =0;v<m-1;v++)
            {
            if(b[v]>b[v+1]){
                int temp;
                temp=b[v];
                b[v]=b[v+1];
                b[v+1]=temp;
            }
        }
        int x=b[0];
        LinkedList<Integer> ll = new LinkedList<Integer>(); 
        for(int i=1;i<=x;i++)
        {
        	if(x%i==0)
        	{
        		ll.add(i);
        	}
        }
       for(int j=0;j<n;j++){
    	  
    	   for(Iterator<Integer> iterator = ll.iterator(); iterator.hasNext();){
    		   int temp = iterator.next();
        	if(!(temp%a[j]==0)){
        		iterator.remove();
        	}
        }	
        }
       for(Integer e : ll)
    	   System.out.print(e+" ");
       System.out.println(ll.size());
    }
}
