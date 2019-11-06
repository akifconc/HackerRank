import java.util.*;
public class DivisibleSumPairs {
	static int flg=0;
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        
        for(int r=0;r<n;r++)
        {
        	for(int i=0;i<n;i++){
        		if(r!=i){
        			if((a[r]+a[i])%k==0){
        				flg++;
        			}
        		}
        	}
        }
        System.out.println(flg/2);
    }
}
