import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Character> keys = new HashMap<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String plaintext = String.valueOf(input.readLine());
        String ciphertext1 = String.valueOf(input.readLine());
        String ciphertext2 = String.valueOf(input.readLine());
        String decoded = "";
        for (int i = 0; i < plaintext.length(); i++) {
            keys.put(ciphertext1.charAt(i), plaintext.charAt(i));
        }
        for (int i = 0; i < ciphertext2.length(); i++) {
            if (keys.get(ciphertext2.charAt(i)) == null) {
                decoded += '.';

            } else {
                decoded += keys.get(ciphertext2.charAt(i));
            }

        }
        System.out.print(decoded);
    }
}
