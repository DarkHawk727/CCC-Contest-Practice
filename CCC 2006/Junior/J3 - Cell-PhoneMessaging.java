import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String message = "";
        int count;
        HashMap<Character, String> timings = new HashMap<>();
        ArrayList<Integer> times = new ArrayList<>();

        timings.put('a', "2");
        timings.put('b', "22");
        timings.put('c', "222");

        timings.put('d', "3");
        timings.put('e', "33");
        timings.put('f', "333");

        timings.put('g', "4");
        timings.put('h', "44");
        timings.put('i', "444");

        timings.put('j', "5");
        timings.put('k', "55");
        timings.put('l', "555");

        timings.put('m', "6");
        timings.put('n', "66");
        timings.put('o', "666");

        timings.put('p', "7");
        timings.put('q', "77");
        timings.put('r', "777");
        timings.put('s', "7777");

        timings.put('t', "8");
        timings.put('u', "88");
        timings.put('v', "888");

        timings.put('w', "9");
        timings.put('x', "99");
        timings.put('y', "999");
        timings.put('z', "9999");

        while (!message.equals("halt")) {
            count = 0;
            message = String.valueOf(input.readLine());
            for (int i = 0; i < message.length(); i++) {
                if (i == 0) {
                    count += timings.get(message.charAt(i)).length();
                } else if (timings.get(message.charAt(i)).charAt(0) == timings.get(message.charAt(i - 1)).charAt(0)) {
                    count += 2;
                    count += timings.get(message.charAt(i)).length();
                } else {
                    count += timings.get(message.charAt(i)).length();
                }
            }
            times.add(count);
        }
        for (int i = 0; i < times.size() - 1; i++) {
            System.out.println(times.get(i));
        }
    }
}
