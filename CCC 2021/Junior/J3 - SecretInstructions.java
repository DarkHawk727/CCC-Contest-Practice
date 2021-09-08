import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> decoded = new ArrayList<String>();
        int code = Integer.parseInt (input.readLine ());
        int A = code / 10000;
        int B = (code - (A * 10000)) / 1000;
        int steps = code % 1000;
        int sum = A + B;
        String previousTurn = "";


       while( code != 99999){
           if(sum % 2 != 0){
               decoded.add("left " + steps);

               previousTurn = "left ";
               code = Integer.parseInt (input.readLine ());
               A = code / 10000;
               B = (code - (A * 10000)) / 1000;
               sum = A + B;
               steps = code % 1000;
           }
           else if(sum % 2 == 0 && sum != 0){
               decoded.add("right " + steps);

               previousTurn = "right ";
               code = Integer.parseInt (input.readLine ());
               A = code / 10000;
               B = (code - (A * 10000)) / 1000;
               sum = A + B;
               steps = code % 1000;
           }
           else{
               decoded.add(previousTurn + steps);

               code = Integer.parseInt (input.readLine ());
               A = code / 10000;
               B = (code - (A * 10000)) / 1000;
               sum = A + B;
               steps = code % 1000;
           }
        }
       for(String i : decoded){
           System.out.println(i);
       }

    }
}
