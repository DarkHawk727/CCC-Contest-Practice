import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char[] songs = {'A', 'B', 'C', 'D', 'E'};
        String used = "ABCDE";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        int n;
        char temp;
        while (b != 4) {
            b = Integer.parseInt(input.readLine());
            n = Integer.parseInt(input.readLine());
            if (b == 1) {
                for (int i = 0; i < n; i++) {
                    used = used.substring(1, 5) + used.charAt(0);
                    songs = used.toCharArray();
                    //ABCDE -> BCDEA | WORKING
                }
            }
            if (b == 2) {
                for (int i = 0; i < n; i++) {
                    used = (used.charAt(4) + used.substring(0, 4));
                    songs = used.toCharArray();
                    //ABCDE -> EABCD | WORKING
                }
            }
            if (b == 3) {
                for (int i = 0; i < n; i++) {
                    temp = songs[0];
                    songs[0] = songs[1];
                    songs[1] = temp;
                    //ABCDE -> BACDE | WORKING
                }
            }
        }
        for (char i : songs) {
            System.out.print(i + " ");
        }
    }
}
