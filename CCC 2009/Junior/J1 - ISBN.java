import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        int first = Integer.parseInt (input.readLine ());
        int second = Integer.parseInt (input.readLine ());
        int third = Integer.parseInt (input.readLine ());
        int sum = 91 + first + (second * 3) + third;
        System.out.println("The 1-3-sum is " + sum);
    }
}
