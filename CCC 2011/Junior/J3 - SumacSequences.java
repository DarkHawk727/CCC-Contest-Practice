import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    int t1 = Integer.parseInt (input.readLine ());
    int t2 = Integer.parseInt (input.readLine ());
    int count = 2;
    int c;
    while(t1 >= t2 && t1 >= 0 && t2 >= 0){
        count++;
        c = t1 - t2;
        t1 = t2;
        t2 = c;
        
    }
    System.out.println(count);
    }
}
