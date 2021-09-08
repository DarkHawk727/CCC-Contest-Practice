import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(input.readLine());
        int day = Integer.parseInt(input.readLine());
        if (month > 2) {
            System.out.println("After");
        } else if (month == 2 && day > 18) {
            System.out.println("After");
        } else if (month == 2 && day == 18) {
            System.out.println("Special");
        } else {
            System.out.println("Before");
        }
    }
}
