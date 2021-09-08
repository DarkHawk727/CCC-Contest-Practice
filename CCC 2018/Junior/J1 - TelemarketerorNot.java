import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(input.readLine());
        int second = Integer.parseInt(input.readLine());
        int third = Integer.parseInt(input.readLine());
        int fourth = Integer.parseInt(input.readLine());
        if ((first == 8 || first == 9) && (fourth == 8 || fourth == 9) && (second == third)) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
