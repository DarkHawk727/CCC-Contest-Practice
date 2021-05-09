import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> counts = new HashMap<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String A = String.valueOf(input.readLine());
        String B = String.valueOf(input.readLine());

        for (int i = 0; i < A.length(); i++) {
            if (counts.containsKey(A.charAt(i))) {
                counts.put(A.charAt(i), counts.get(A.charAt(i))+1);
            } else {
                counts.put(A.charAt(i), 1);
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) != '*') {
                if (counts.containsKey(B.charAt(i))) {
                    if (counts.get(B.charAt(i)) == 0) {
                        System.out.println("N");
                        System.exit(0);
                    } else {
                        counts.put(B.charAt(i), counts.get(B.charAt(i)) - 1);
                    }
                } else {
                    System.out.println("N");
                    System.exit(0);
                }
            }
        }
        System.out.println("A");
    }
}
