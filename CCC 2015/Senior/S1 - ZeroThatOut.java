import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> numbers = new Stack<Integer>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(input.readLine());
        int num;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(input.readLine());
            if (num == 0) {
                numbers.pop();

            } else {
                numbers.push(num);
            }
        }
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
