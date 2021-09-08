import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> data = new ArrayList<>();
        String X = "";
        String temp = "";
        String[] splited = {""};
        int num = 0;
        int L = Integer.parseInt(input.readLine());
        for (int i = 0; i < L; i++) {
            X = String.valueOf(input.readLine());
            num = Integer.parseInt(X.substring(0, X.indexOf(" ")));
            for (int n = 0; n < num; n++) {
                temp += X.charAt(X.length() - 1);
            }
            temp += " ";
        }

        splited = temp.split("\\s+");
        for (int i = 0; i < splited.length; i++) {
            System.out.println(splited[i]);
        }
    }
}
