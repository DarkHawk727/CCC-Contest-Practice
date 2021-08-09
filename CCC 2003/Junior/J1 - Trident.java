import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        int s = Integer.parseInt(input.readLine());
        int h = Integer.parseInt(input.readLine());

        for (int i = 1; i <= t; i++) {
            System.out.print("*");
            for (int n = 1; n <= s; n++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int n = 1; n <= s; n++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 2 * s + 3; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= h; i++) {
            System.out.println();
            for (int n = 1; n <= s + 1; n++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
}
