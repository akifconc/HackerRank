import java.util.Scanner;

public class Sample {
	
	static int B=0;
	static int H=0;
	static boolean flag=true;
	static{
	    try{
	        Scanner sc = new Scanner(System.in);
	        B=sc.nextInt();
	        H=sc.nextInt();
	    if(B<=0 || H<=0){
	    	flag=false;
	        throw new Exception();
	    }
	}catch(Exception e){
	    System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
