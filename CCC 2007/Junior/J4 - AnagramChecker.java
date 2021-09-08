import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String string1 = String.valueOf(input.readLine());
        String string2 = String.valueOf(input.readLine());
        String finalstr1 = "";
        string1 = string1.replaceAll("\\s", "");
        string2 = string2.replaceAll("\\s", "");
        char[] chararray1 = string1.toCharArray();
        char[] chararray2 = string2.toCharArray();
        Arrays.sort(chararray1);
        Arrays.sort(chararray2);

        if (Arrays.equals(chararray1, chararray2)) {
            System.out.println("Is an anagram.");
        } else {
            System.out.println("Is not an anagram.");
        }

    }
}
