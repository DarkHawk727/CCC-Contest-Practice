import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int J = Integer.parseInt (input.readLine ());

        System.out.println(((J-1)*(J-2)*(J-3))/6);
    }
}
