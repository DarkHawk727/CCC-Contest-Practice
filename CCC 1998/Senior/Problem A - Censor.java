import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> messages = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String line = "";

        for (int i = 0; i < n; i++) {
            line = String.valueOf(input.readLine());
            messages.add(line.replaceAll("\\b\\w[a-z]{3}\\b", "****"));
        }
        for (String i : messages) {
            System.out.println(i);
        }
    }
}
