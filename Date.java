import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Date {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    int month = Integer.parseInt(in.next());
    int day = Integer.parseInt(in.next());
    int year = Integer.parseInt(in.next());
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);
    java.util.Date date = cal.getTime();
    String word = new SimpleDateFormat("EEEE").format(date);
    System.out.println(word.toUpperCase());
    }
}
