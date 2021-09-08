import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String T = String.valueOf(input.readLine());
        String S = String.valueOf(input.readLine());
        for(int i = 0; i < S.length(); i ++){
            String Shift = S.substring(i) + S.substring(0, i);
            if(T.contains(Shift)){
                System.out.println("yes");
                System.exit(0);
            }
        }
        System.out.println("no");
    }
}
