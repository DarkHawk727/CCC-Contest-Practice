import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int sS = 0;
        int tT = 0;
        StringBuilder total = new StringBuilder();
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (input.readLine ());
        for(int i = 0; i < N; i++){
            String X = String.valueOf(input.readLine());
            total.append(X);
        }
        for(int j = 0; j < total.length(); j++){
            if(total.charAt(j) == 't' || total.charAt(j) == 'T'){
                tT++;
            }
            else if(total.charAt(j) == 's' || total.charAt(j) == 'S'){
                sS++;
            }
        }
        if(tT > sS){
            System.out.println("English");
        }
        else if( sS > tT){
            System.out.println("French");
        }
        else{
            System.out.println("French");
        }
    }
}
