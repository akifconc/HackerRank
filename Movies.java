import java.util.Scanner;

public class Movies {

	public static int reverse(int s){
		int num=0;
		int sum=0;
		while(s>0){
	    num = s%10;
		sum=(sum*10)+num;
		s=s/10;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i=0,j=0,k=0;
		int flag=0;
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		sc.close();
		int[] x = new int[(j-i)+2];
		int a=0;
		int m=i;
		while(m<=j){
			x[a]=m;
			a++;
			m++;
		}
		for(int r=0;r<(j-i)+1;r++){
			int temp=x[r];
			int z=reverse(temp);
			if((x[r]-z)%k==0){
				flag++;
			}
			//System.out.print(x[r]+" ");
		}
		System.out.println(flag);
	}
}
