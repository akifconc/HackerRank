
import java.util.*;


public class BTS {

    public static boolean isItAfactorOfFirstArr(int n, int[] arr) {
    boolean isIt = false;
    for (int i = 0; i < arr.length; i++) {
        if (n % arr[i] == 0) {
            isIt = true;
        } else {
            isIt = false;
            break;
        }
    }
    return isIt;
}

public static boolean isItAfactorOfSecondArr(int n, int[] arr) {
    boolean isIt = false;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % n == 0) {
            isIt = true;
        } else {
            isIt = false;
            break;
        }
    }
    return isIt;
}

public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();

    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
        a[a_i] = in.nextInt();
    }

    int[] b = new int[m];
    for (int b_i = 0; b_i < m; b_i++) {
        b[b_i] = in.nextInt();
    }
    in.close();

    List<Integer> numberList = new ArrayList<Integer>();

    for (int i = a[a.length - 1]; i <= b[0]; i++) {

        if (isItAfactorOfFirstArr(i, a) && isItAfactorOfSecondArr(i, b)) {
            numberList.add(i);
        }
    }
    System.out.println(numberList.size());
}
    
}
