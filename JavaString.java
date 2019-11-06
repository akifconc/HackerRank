import java.io.*;
import java.util.*;

public class JavaString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int flg=0;
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length()+B.length();
        int count=0;
        int result = A.compareTo(B);
        
        sc.close();
        System.out.println(n);
        if(result>0
        		)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        char x =(char) (A.charAt(0)-32);
        char y =(char) (B.charAt(0)-32);
        A= A.replace(A.charAt(0), x);
        B= B.replace(B.charAt(0), y);
        System.out.println(A+" "+B);
            }
    	
}
