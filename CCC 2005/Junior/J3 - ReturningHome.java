import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> directions = new ArrayList<>();
        String instruction = "";
        String end = "";
        while (!instruction.equals("SCHOOL")) {
            instruction = String.valueOf(input.readLine());
            directions.add(instruction);
        }
        for (int i = directions.size() - 2; i > -1; i -= 2) {
            System.out.print("Turn ");
            if (directions.get(i).equals("R")) {
                System.out.print("LEFT ");
            } else {
                System.out.print("RIGHT ");
            }
            if (i == 0) {
                System.out.print("into your HOME.");
            } else {
                System.out.print("onto " + directions.get(i - 1) + " street.\n");
            }
        }
    }
}
