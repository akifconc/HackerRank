import java.util.*;
public class BonAppetit {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int b =sc.nextInt();
		if((sum/2)==b){
			sum=sum-arr[k];
			System.out.println(b-sum/2);
		}
		else
		{
			System.out.println("Bon Appetit");
		}
		sc.close();
	}
}
