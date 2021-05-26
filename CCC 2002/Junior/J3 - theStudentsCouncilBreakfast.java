import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int combinations = 0;
        int smallest = Integer.MAX_VALUE;

        int pink = Integer.parseInt(input.readLine());
        int green = Integer.parseInt(input.readLine());
        int red = Integer.parseInt(input.readLine());
        int orange = Integer.parseInt(input.readLine());
        int amount = Integer.parseInt(input.readLine());

        for (int p = 0; p <= amount / pink; p++) {
            for (int g = 0; g <= amount / green; g++) {
                for (int r = 0; r <= amount / red; r++) {
                    for (int o = 0; o <= amount / orange; o++) {
                        if (p * pink + g * green + r * red + o * orange == amount) {
                            System.out.println("# of PINK is " + p + " # of GREEN is " + g + " # of RED is " + r + " # of ORANGE is " + o);
                            combinations++;
                            smallest = Math.min(smallest, p + g + r + o);
                        }
                    }
                }
            }
        }

        System.out.println("Total combinations is " + combinations + ".");
        System.out.println("Minimum number of tickets to print is " + smallest + ".");
    }
}
