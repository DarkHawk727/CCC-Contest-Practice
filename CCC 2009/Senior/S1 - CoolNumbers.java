import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int temp;
        int count = 0;
        for (int i = 1; i < 22; i++) {
            temp = (int) Math.pow(i, 6);
            if (temp >= a && temp <= b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
