import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =
                new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int X = Integer.parseInt(input.readLine());
        int first = Integer.parseInt(input.readLine());
        int second = Integer.parseInt(input.readLine());
        int third = Integer.parseInt(input.readLine());
        while (X >= 1) {

            X--;
            first++;
            count++;
            if (first == 35 && count > -1) {
                X += 30;
                first = 0;
            }
            if(X == 0){
                break;
            }
            X--;
            second++;
            count++;
            if (second == 100 && count > -1) {
                X += 60;
                second = 0;
            }
            if(X == 0){
                break;
            }
            X--;
            third++;
            count++;
            if (third == 10 && count > -1) {
                X += 9;
                third = 0;
            }
            if(X == 0){
                break;
            }
        }
        System.out.println("Martha plays " + count +
                " times before going broke.");
    }
}
