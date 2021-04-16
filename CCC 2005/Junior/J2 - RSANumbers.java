import java.io.*;
import java.util.*;

public class Main {
    public static int getDivisors(int n) {
        int divisors = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int lowerBound = Integer.parseInt(input.readLine());
        int upperBound = Integer.parseInt(input.readLine());
        for (int n = lowerBound; n < upperBound + 1; n++) {
            if (getDivisors(n) == 4) {
                count++;
            }
        }
        System.out.println("The number of RSA numbers between " + lowerBound + " and " + upperBound + " is " + count);
    }

}
