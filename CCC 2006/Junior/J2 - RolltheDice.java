import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int m = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= m; i++) {
            if ((10 - i) <= n && (10 - i) > 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            System.out.println("There are " + count + " ways to get the sum 10.");
        }
    }
}
