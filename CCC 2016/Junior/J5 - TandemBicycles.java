import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int question = Integer.parseInt(input.readLine());
        int N = Integer.parseInt(input.readLine());
        int[] dmojistan = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] pegland = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(dmojistan);
        Arrays.sort(pegland);

        if (question == 2) {
            for (int l = 0, r = pegland.length - 1; l < r; l++, r--) {
                int temp = pegland[l];
                pegland[l] = pegland[r];
                pegland[r] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            sum += Math.max(dmojistan[i], pegland[i]);
        }
        System.out.println(sum);
    }
}
