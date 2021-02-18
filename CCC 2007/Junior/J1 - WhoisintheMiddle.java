import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int bowl1 = Integer.parseInt (input.readLine ());
        int bowl2 = Integer.parseInt (input.readLine ());
        int bowl3 = Integer.parseInt (input.readLine ());
        ArrayList<Integer> bowls = new ArrayList<Integer>();
        bowls.add(bowl1);
        bowls.add(bowl2);
        bowls.add(bowl3);
        Collections.sort(bowls);
        System.out.println(bowls.get(1));
    }
}
