import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> translations = new HashMap<>();
        int number = 0;
        int S = 0;
        int a, r, s;
        int R = Integer.MAX_VALUE;

        translations.put('I', 1);
        translations.put('V', 5);
        translations.put('X', 10);
        translations.put('L', 50);
        translations.put('C', 100);
        translations.put('D', 500);
        translations.put('M', 1000);
        
        String temp = String.valueOf(input.readLine());
        for (int i = 0; i < temp.length(); i += 2) {
            a = Character.getNumericValue(temp.charAt(i));
            r = translations.get(temp.charAt(i + 1));
            s = a * r;
            number += s;
            if (r > R) {
                number -= 2 * S;
            }
            S = s;
            R = r;
        }
        System.out.println(number);
    }
}
