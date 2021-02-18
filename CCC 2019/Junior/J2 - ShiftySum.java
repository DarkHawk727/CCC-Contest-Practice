import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
 BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (input.readLine ());
        int k = Integer.parseInt (input.readLine ());
        int ans = N;
        for(int i = 1; i < k+1; i++){
            ans += N * Math.pow(10,i);
        }
        System.out.println(ans);
    }
}
