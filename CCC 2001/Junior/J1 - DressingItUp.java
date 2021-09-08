import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(input.readLine());
        int spaces, asterisks;
        spaces = 2 * H - 2;
        asterisks = 1;
        for (int i = 1; i <= H; i++) {
            for (int n = 1; n <= asterisks; n++) {
                System.out.print("*");
            }
            for (int n = 1; n <= spaces; n++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= asterisks; n++) {
                System.out.print("*");
            }
            if (i <= H / 2) {
                spaces -= 4;
                asterisks += 2;
            } else {
                spaces += 4;
                asterisks -= 2;
            }
            System.out.println();
        }
    }
}
