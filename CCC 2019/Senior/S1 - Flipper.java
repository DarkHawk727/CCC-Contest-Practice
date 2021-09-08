import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int arr[][] = {{1, 2}, {3, 4}};
        int temp = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String X = String.valueOf(input.readLine());
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'V') {
                temp = arr[0][0];
                arr[0][0] = arr[0][1];
                arr[0][1] = temp;

                temp = arr[1][0];
                arr[1][0] = arr[1][1];
                arr[1][1] = temp;

            }
            if (X.charAt(i) == 'H') {
                temp = arr[0][0];
                arr[0][0] = arr[1][0];
                arr[1][0] = temp;

                temp = arr[0][1];
                arr[0][1] = arr[1][1];
                arr[1][1] = temp;
            }
        }
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
    }
}
