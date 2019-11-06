import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        in.close();
        if(time.contains("AM"))
          {
            time= time.replace("AM","");
            String x[] = time.split("\\:",2);
            String tmp = x[0];
            if(tmp.equals("12"))
             {
                tmp="00:";
                
                time=tmp.concat(x[1]);
             }
            System.out.println(time);
        }
        else if(time.contains("PM"))
        {
            time=time.replace("PM","");
           String x[] = time.split("\\:",2);
            String token = x[0];
            if(token.equals("12"))
                {
                    token=token.concat(":");
                    time=token.concat(x[1]);
            }
            else
            {
            int temp = Integer.parseInt(token);
            temp=temp+12;
            if(temp==24)
               {temp=0;
                token = Integer.toString(temp);
                time = token.concat("0");
               }
            token = Integer.toString(temp);
            time = token.concat(":");
            time = time.concat(x[1]);
            }
            System.out.println(time);
        }
    }
}
