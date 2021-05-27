import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp = String.valueOf(input.readLine());
        String temp1 = String.valueOf(input.readLine());

        int a = Integer.parseInt(temp.substring(0, temp.indexOf(' ')));
        int b = Integer.parseInt(temp.substring(temp.indexOf(' ') + 1));
        int c = Integer.parseInt(temp1.substring(0, temp1.indexOf(' ')));
        int d = Integer.parseInt(temp1.substring(temp1.indexOf(' ') + 1));
        int t = Integer.parseInt(input.readLine());

        int distance = Math.abs(a - c) + Math.abs(b - d);
        
        if (distance <= t && (t - distance) % 2 != 1) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
