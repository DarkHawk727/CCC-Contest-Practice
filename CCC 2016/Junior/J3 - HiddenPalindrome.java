import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String X = String.valueOf(input.readLine());
        int length = 1;

        for (int i = 0; i < X.length(); i++) {
            for (int j = i; j < X.length(); j++) {
                int flag = 1;
                for (int n = 0; n < (j - i + 1) / 2; n++) {
                    if (X.charAt(i + n) != X.charAt(j - n)) {
                        flag = 0;
                    }
                }
                if (flag != 0 && (j - i + 1) > length) {
                    length = j - i + 1;
                }
            }
        }
        System.out.println(length);
    }
}
