import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int lowest=score[0];
        int highest=score[0];
        int low=0;
        int high=0;
        for(int i=1;i<n;i++){
            if(lowest>score[i]){
                lowest=score[i];
                low++;
            }
            if(highest<score[i]){
                highest=score[i];
                high++;
            }
        }
        System.out.print(high+" "+low);
    }
}
