import java.util.*;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();//starting point of house
        int t = in.nextInt();//ending point of house
        int a = in.nextInt();//point of apple tree
        int b = in.nextInt();//point of orange tree
        int m = in.nextInt();//number of apples
        int n = in.nextInt();//number of oranges
        int[] apple = new int[m];//distances of apples fallen
        int aflag=0;
        int oflag=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            //if(apple[apple_i]>0)
                {
            	if((apple[apple_i]+a)>=s && (apple[apple_i]+a)<=t )
                       {    aflag++;
                            System.out.println(apple[apple_i]+a);
                            System.out.println("value of s "+ s);
                       }
            }
        }
        int[] orange = new int[n];//distances of oranges fallen
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            //if(orange[orange_i]<0)
                {
                    if(orange[orange_i]+b<=t && orange[orange_i]+b>=s)
                        oflag++;
            }
        }
        in.close();
       System.out.println(aflag);
        System.out.println(oflag);
        
        
    }
}
