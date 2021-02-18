import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        int x = Integer.parseInt (input.readLine ());
        int y = Integer.parseInt (input.readLine ());
        
        if(x > 0 && y < 0){
            System.out.println("4");
        }       
        if(x < 0 && y < 0){
            System.out.println("3");
        }
        if(x < 0 && y > 0){
            System.out.println("2");
        }
        if(x > 0 && y > 0){
            System.out.println("1");
        }
    }
}
