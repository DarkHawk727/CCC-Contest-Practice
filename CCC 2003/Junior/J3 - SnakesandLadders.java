import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean win = false;
        ArrayList<String> messages = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        int sum = 1;
        while (!win) {
            choice = Integer.parseInt(input.readLine());
            if (choice == 0) {
                break;
            }
            sum += choice;
            if (sum == 9) {
                sum = 34;
            } else if (sum == 40) {
                sum = 64;
            } else if (sum == 54) {
                sum = 19;
            } else if (sum == 67) {
                sum = 86;
            } else if (sum == 90) {
                sum = 48;
            } else if (sum == 99) {
                sum = 77;

            } else if (sum == 100) {
                win = true;
                //break;
            } else if (sum > 100) {
                sum -= choice;
            }
            messages.add("You are now on square " + sum);
        }

        for (String i : messages) {
            System.out.println(i);
        }
        if (choice == 0) {
            System.out.println("You Quit!");
        } else {
            System.out.println("You Win!");
        }
    }
}
