import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> briefcases = new HashMap<Integer, Integer>();
        briefcases.put(1, 100);
        briefcases.put(2, 500);
        briefcases.put(3, 1000);
        briefcases.put(4, 5000);
        briefcases.put(5, 10000);
        briefcases.put(6, 25000);
        briefcases.put(7, 50000);
        briefcases.put(8, 100000);
        briefcases.put(9, 500000);
        briefcases.put(10, 1000000);
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int sum1 = 1691900;
        int sum = 0;
        // average is 10-n;
        int chosen = 0;
        int n = Integer.parseInt (input.readLine ());
        for(int i = 0; i < n; i ++){
            chosen = Integer.parseInt (input.readLine ());
            sum1 -= briefcases.get(chosen);
        }
        int offer = Integer.parseInt (input.readLine ());
        sum = sum1 / (10-n);
        if(offer > sum){
            System.out.println("deal");
        }
        else{
            System.out.println("no deal");
        }
    }
}
