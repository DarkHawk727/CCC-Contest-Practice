import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int happy = 0;
        int sad = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String X = String.valueOf(input.readLine());
        happy = X.length() - X.replace(")", "").length();
        sad = X.length() - X.replace("(", "").length();

        if (happy > sad && happy > 0) {
            System.out.println("happy");
        } else if (happy < sad && sad > 0) {
            System.out.println("sad");
        } else if (happy == 0 && sad == 0) {
            System.out.println("none");
        } else if (happy == sad && happy > 0) {
            System.out.println("unsure");
        }
    }
}
