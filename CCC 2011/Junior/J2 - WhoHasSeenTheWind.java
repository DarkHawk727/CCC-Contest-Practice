import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int t = 1;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(input.readLine());
        int M = Integer.parseInt(input.readLine());
        int A = -3 + h;
        while (t < M && A > 0) {
            t++;
            A = -6 * t * t * t * t + h * t * t * t + 2 * t * t + t;
        }
        if (A > 0) {
            System.out.println("The balloon does not touch ground in the given time.");
        } else {
            System.out.println("The balloon first touches ground at hour:");
            System.out.println(t);
        }
    }
}
