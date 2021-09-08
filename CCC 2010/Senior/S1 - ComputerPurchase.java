import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String first = "", second = "", name;
        int value, firstValue = 0, secondValue = 0;
        String temp;
        String[] information;

        int n = Integer.parseInt(input.readLine());

        for (int i = 0; i < n; i++) {
            temp = String.valueOf(input.readLine());
            information = temp.split(" ");
            name = information[0];
            value = (2 * Integer.parseInt(information[1])) + (3 * Integer.parseInt(information[2])) + Integer.parseInt(information[3]);
            if ((value > firstValue) || (value == firstValue && name.compareTo(first) < 0)) {
                second = first;
                secondValue = firstValue;
                first = name;
                firstValue = value;
            } else if ((value > secondValue) || (value == secondValue && name.compareTo(second) < 0)) {
                secondValue = value;
                second = name;
            }

        }
        System.out.println(first);
        if (n > 1) {
            System.out.println(second);
        }
    }
}
