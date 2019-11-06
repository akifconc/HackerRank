import java.util.*;
public class SockMerchant {
	static int flag =0;
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for(int c_i=0; c_i < n; c_i++){
            ls.add(in.nextInt());
            
        }
        //Arrays.sort();
        Object[] c = ls.toArray();
        in.close(); 
        int d =0;
        int temp = (Integer) c[d];
        for(Iterator<Integer> iterator = ls.iterator(); iterator.hasNext();){
 		   int f = iterator.next();
     	if(temp==f){
     		iterator.remove();
     		flag++;
     	}
     	d++;
     	temp=(Integer) c[d];
     }	
        System.out.println(flag);
}
}