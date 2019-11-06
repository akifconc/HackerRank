import java.util.*;
public class HurdleRace {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] height = new int[n];
	        for(int height_i=0; height_i < n; height_i++){
	            height[height_i] = in.nextInt();
	        }
	        in.close();
	        int flag=0;
	        int temp=0;
	        for(int j=0;j<n-1;j++){
	            if(height[j]>height[j+1]){
	                temp=height[j];
	                height[j]=height[j+1];
	                height[j+1]=temp;
	            }
	        }
	        
	      
	        if(height[n-1]>k){
	        		flag=flag+(height[n-1]-k);
	        }
	        System.out.println(flag);
	    }
	 

}
