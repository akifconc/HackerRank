import java.util.*;
public class DrawingBook {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count=1;
		int flag=0;
		sc.close();
		
		for (int i=2;i<=n;i++){
			if(i!=p&&i+1!=p){
				count++;
			}
			else
				break;
			i++;
		}
		for(int j=n;j>=2;j--){
		
			if(j!=p&&j-1!=p){
				flag++;
			}
			else
				break;
			j--;
		}
		if(p==1)
			System.out.println('0');
		else if(p==n)
			System.out.println('0');
		else if(flag>count){
			System.out.println(count);
		}
		else
			System.out.println(flag);
	}
}
