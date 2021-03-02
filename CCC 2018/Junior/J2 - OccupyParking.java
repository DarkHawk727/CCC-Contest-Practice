import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int N = Integer.parseInt(input.readLine());
        String yesterday = String.valueOf(input.readLine());
        String today = String.valueOf(input.readLine());
        for (int i = 0; i < N; i++) {
            if (yesterday.charAt(i) == today.charAt(i) && (today.charAt(i) == 'C')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
