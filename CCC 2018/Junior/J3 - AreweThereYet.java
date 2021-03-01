import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String in = input.readLine();
        StringTokenizer st = new StringTokenizer(in);
        int a = Integer.parseInt (st.nextToken ());;
        int b = Integer.parseInt (st.nextToken ());;
        int c = Integer.parseInt (st.nextToken ());;
        int d = Integer.parseInt (st.nextToken ());;
        int x = a+b;
        int y = a+b+c;
        int z = a+b+c+d;
        System.out.println("0 " + a + " " + x + " " + y + " " + z);
        System.out.println(a + " " +  "0" + " " +  Math.abs(a-x) + " " +  Math.abs(a-y) + " " +  Math.abs(a-z));
        System.out.println(x + " " +  Math.abs(x-a) + " " +  "0" + " " +  Math.abs(x-y) + " " +  Math.abs(x-z));
        System.out.println(y + " " +  Math.abs(y-a) + " " +  Math.abs(y-x) + " " +  "0" + " " +  Math.abs(y-z));
        System.out.println(z + " " +  Math.abs(z-a) + " " +  Math.abs(z-x) + " " +  Math.abs(z-y) + " " +  "0");
    }
}
