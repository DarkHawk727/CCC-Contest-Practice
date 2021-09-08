import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        int a3 = Integer.parseInt (input.readLine ());
        int a2 = Integer.parseInt (input.readLine ());
        int a1 = Integer.parseInt (input.readLine ());
        int b3 = Integer.parseInt (input.readLine ());
        int b2 = Integer.parseInt (input.readLine ());
        int b1 = Integer.parseInt (input.readLine ());
        int apple = (3*a3) + (2*a2) + (1*a1);
        int banana = (3*b3) + (2*b2) + (1*b1);
        if(apple > banana){
            System.out.println("A");
        }
        else if(apple < banana){
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }

    }
}
