import java.io.*;
import java.util.*;
// Before: 1989 2 27
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> answers = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(input.readLine());
        String bruh;
        int year, month, day;
        for (int i = 0; i < X; i++) {
            bruh = String.valueOf(input.readLine());
            year = Integer.parseInt(bruh.split(" ")[0]);
            month = Integer.parseInt(bruh.split(" ")[1]);
            day = Integer.parseInt(bruh.split(" ")[2]);
            if ((year < 1989) || (year == 1989 && month < 2) || (year == 1989 && month == 2 && day <= 27)) {
                answers.add("Yes");
            } else {
                answers.add("No");
            }
        }
        for (String i : answers) {
            System.out.println(i);
        }
    }
}
