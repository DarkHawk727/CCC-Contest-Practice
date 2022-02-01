import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(input.readLine());
        Y++;
        while (!isDistinct(Y)) {
            Y++;
        }
        System.out.println(Y);
    }

    public static boolean isDistinct(int Y) {
        int[] nums = new int[10];
        String str = String.valueOf(Y);
        for (int i = 0; i < str.length(); i++) {
            int temp = Integer.parseInt(str.substring(i, i + 1));
            nums[temp]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
