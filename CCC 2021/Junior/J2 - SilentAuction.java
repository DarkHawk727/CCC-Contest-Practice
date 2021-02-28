import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<Integer> Bids = new ArrayList<Integer>();
        int N = Integer.parseInt (input.readLine ());
        for(int i = 0; i < N; i++){
            String name = String.valueOf(input.readLine());
            int bid = Integer.parseInt (input.readLine ());
            Names.add(name);
            Bids.add(bid);
        }

        System.out.println(Names.get(Bids.indexOf(Collections.max(Bids))));

    }
}
