
import java.util.*;


public class DesignPDf {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag=0;
        int temp=0;
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        in.close();
        char x =' ';
        for(int j=0;j<word.length();j++)
            {
            x=word.charAt(j);
            int ascii = (int)x;
            for(int i =97;i<=122;i++)
               { if(ascii!=i)
                    flag++;
                else break;
               }
            if(h[flag]>temp)
            {
            temp = h[flag];
            }
            flag=0;
        }
        System.out.print(temp*word.length()*1);
    }
}
