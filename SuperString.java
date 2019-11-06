import java.util.*;
public class SuperString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer x = new StringBuffer(sc.nextLine());
        sc.close();
        int i=0;
        while(i<x.length()-1){
            if(x.charAt(i)==x.charAt(i+1)){
                x.delete(i, i+2);
                i=0;
            }  
            else{
            	i++;
            }
        }
        String s;
        s= x.toString();
        if(!s.isEmpty()){
        	System.out.print(x);
        }
        else
        	System.out.print("Empty String");
    }
}