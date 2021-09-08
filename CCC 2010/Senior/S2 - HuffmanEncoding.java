import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char[] letters = new char[20];
        String[] codes = new String[20];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String raw = "";
        String ans = "";

        int n;
        int k = Integer.parseInt(input.readLine());
        for (int i = 0; i < k; i++) {
            raw = String.valueOf(input.readLine());
            letters[i] = raw.charAt(0);
            codes[i] = raw.substring(raw.indexOf(" ")+1);
        }
        String coded = String.valueOf(input.readLine());


        while (coded.length() > 0) {
            n = 0;
            while (!coded.startsWith(codes[n]))
                n++;
            ans = ans + letters[n];
            coded = coded.substring(codes[n].length());

        }
        System.out.println(ans);
    }
}
