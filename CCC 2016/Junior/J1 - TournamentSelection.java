import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int points = 0;
        BufferedReader input =
                new BufferedReader(new InputStreamReader(System.in));
        String a1 = String.valueOf(input.readLine());
        String a2 = String.valueOf(input.readLine());
        String a3 = String.valueOf(input.readLine());
        String a4 = String.valueOf(input.readLine());
        String a5 = String.valueOf(input.readLine());
        String a6 = String.valueOf(input.readLine());


        StringBuilder str = new StringBuilder();
        str.append(a6);
        str.append(a5);
        str.append(a4);
        str.append(a3);
        str.append(a2);
        str.append(a1);
            for (int i = 0; i < 6; i++) {
                if (str.charAt(i) == 'W') {
                    points++;
                }
            }
            if (points == 5 || points == 6) {
                System.out.println("1");
            } else if (points == 3 || points == 4) {
                System.out.println("2");
            } else if (points == 1 || points == 2) {
                System.out.println("3");
            } else {
                System.out.println("-1");
            }
        }
    }
