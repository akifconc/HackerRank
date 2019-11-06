import java.util.*;
public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int temp=5;
		int liked=0;
		for(int i=0;i<n;i++){
			liked=liked+temp/2;
			temp=(temp/2)*3;
		}
		System.out.println(liked);
	}
}
