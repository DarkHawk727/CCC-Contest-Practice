import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int B = Integer.parseInt (input.readLine ());
        int P = 5* B - 400;
        if(P > 100){
            System.out.println(P);
            System.out.println("-1");
        }
        else if(P < 100){
            System.out.println(P);
            System.out.println("1");
        }
        else{
            System.out.println(P);
            System.out.println("0");
        }

    }
}
