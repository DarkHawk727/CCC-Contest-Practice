import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> pennies = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int sum;
        double bruh;
        int r = Integer.parseInt(input.readLine());
        while (r != 0) {
            sum = 0;
            bruh = (double) r * r;
            for (int i = 1; i <= r; i++) {
                sum += (int) Math.sqrt(bruh - (double) i * i) + 1;
            }
            sum = 4 * sum + 1;
            pennies.add(sum);
            r = Integer.parseInt(input.readLine());
        }
        for (int i : pennies) {
            System.out.println(i);
        }
    }
}
