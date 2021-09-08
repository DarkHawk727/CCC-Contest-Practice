import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int length;
        boolean valid;
        String original, first, last;
        int lower = Integer.parseInt(input.readLine());
        int upper = Integer.parseInt(input.readLine());

        for (int i = lower; i <= upper; i++) {
            original = String.valueOf(i);
            if (!(original.contains("2") || original.contains("3") || original.contains("4") || original.contains("5") || original.contains("7"))) {
                int n = 1;
                length = original.length();
                valid = false;
                while (n <= length / 2) {
                    first = original.substring(n - 1, n);
                    last = original.substring(length - n, length + 1 - n);

                    if (first.equals("9") && last.equals("6")) {
                        valid = true;
                    } else if (first.equals("6") && last.equals("9")) {
                        valid = true;
                    } else if (first.equals(last) && !(first.equals("6") || first.equals(("9")))) {
                        valid = true;
                    } else {
                        valid = false;
                        break;
                    }
                    n++;
                }
                if (length % 2 == 1) {
                    if (original.charAt(length / 2) == '6') {
                        valid = false;
                    }
                    if (original.charAt(length / 2) == '9') {
                        valid = false;
                    }
                }
                if(original.equals("1") || original.equals("8") || valid){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
