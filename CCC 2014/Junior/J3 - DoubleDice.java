import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt (input.readLine ());
        int Antonia = 100;
        int David = 100;

        for(int i = 0; i < n; i ++){
            String in = input.readLine();
            StringTokenizer st = new StringTokenizer(in);
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if(a > d){
                David -= a;
            }
            else if(d > a){
                Antonia -= d;
            }
        }
        System.out.println(Antonia);
        System.out.println(David);
        input.close();
    }
}
