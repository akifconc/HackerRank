import java.util.*;
public class MiniMax {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        long[] sum=new long[5];
	        
	        int i=0;
	        sum[i]=a+b+c+d;
	        i++;
	        sum[i]=b+c+d+e;
	        i++;
	        sum[i]=c+d+e+a;
	        i++;
	        sum[i]=d+e+a+b;
	        i++;
	        sum[i]=e+a+b+c;
	        long min=sum[0];
	        long max=sum[0];
	        for(int j=1;j<5;j++){
	        	if(min>sum[j])
	        		min=sum[j];
	        	else if(max<sum[j])
	        		max=sum[j];
	        	}
	        System.out.print(min+" "+max);
	        in.close();
	 }
}
