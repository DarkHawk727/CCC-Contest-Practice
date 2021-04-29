import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int trout = Integer.parseInt(input.readLine());
        int pike = Integer.parseInt(input.readLine());
        int pickerel = Integer.parseInt(input.readLine());
        int limit = Integer.parseInt(input.readLine());
        for (int i = 0; i <= limit / pickerel; i++) {
            for (int j = 0; j <= limit / pike; j++) {
                for (int n = 0; n <= limit / trout; n++) {
                    if (n == 0 && j == 0 && i == 0) {
                        continue;
                    }
                    if (i * pickerel + j * pike + n * trout <= limit) {
                        count++;
                        System.out.println(n + " Brown Trout, " + j + " Northern Pike, " + i + " Yellow Pickerel");
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + count);
    }
}
