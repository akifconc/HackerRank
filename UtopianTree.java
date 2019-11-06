import java.util.*;
public class UtopianTree {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n =new int[t];
        for(int a = 0; a < t; a++){
            n[a] = in.nextInt();
        }
        in.close();
        for(int i=0;i<t;i++)
        {	int h=1;
        	int x=n[i];
        	int count=1;
        	while(x>0){
        		if(count>0)
        		{
        			h=h*2;
        			count=0;
        		}
        		else{
        			h=h+1;
        			count=1;
        		}
        		x--;
        	}
        	System.out.println(h);
        }
    }
	
}
