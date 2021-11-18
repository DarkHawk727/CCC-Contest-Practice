import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int first = Integer.parseInt (input.readLine ());
        int second = Integer.parseInt (input.readLine ());
        int third = Integer.parseInt (input.readLine ());
        int fourth = Integer.parseInt (input.readLine ());

        if(second > first && third > second && fourth > third){
            System.out.println("Fish Rising");
        }
        else if(second < first && third < second && fourth < third){
            System.out.println("Fish Diving");
        }
        else if(second == first && third == second && fourth == third){
            System.out.println("Fish At Constant Depth");
        }
        else{
            System.out.println("No Fish");
        }
    }
}
