import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int s;
        int temp;
        char letter;
        String finalCode = "";
        int K = Integer.parseInt(input.readLine());
        String code = String.valueOf(input.readLine());
        for (int i = 0; i < code.length(); i++) {
            letter = code.charAt(i);
            s = 3 * (i + 1) + K;
            temp = (int) letter - s;
            if (temp < 65) {
                temp = 90 + temp - 65 + 1;
            }
            finalCode += Character.toString((char) temp);
        }
        System.out.println(finalCode);

    }
}
