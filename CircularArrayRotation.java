import java.util.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<k;i++){
            int temp=a[n-1];
            for(int j=n-1;j>0;j--)          
            	a[j]=a[j-1];
            a[0]=temp;
        }	
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
        in.close();
    }
}
