import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> messages = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int X;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            X = Integer.parseInt(input.readLine());
            for (int j = 2; j < Math.sqrt(X); j++) {
                if (X % j == 0) {
                    if (j * j != X) {
                        sum += j + X / j;
                    } else {
                        sum += j;
                    }
                }
            }
            if (sum == X) {
                messages.add(X + " is a perfect number.");
            } else if (sum == 1 || sum < X) {
                messages.add(X + " is a deficient number.");
            } else if (sum > X) {
                messages.add(X + " is an abundant number.");
            }
            sum = 0;
        }
        for (String i : messages) {
            System.out.println(i);
        }
    }
}
