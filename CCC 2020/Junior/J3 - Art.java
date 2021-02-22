import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (input.readLine ());
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            String[] points = String.valueOf(input.readLine()).split(",");
            X.add(Integer.parseInt(points[0]));
            Y.add(Integer.parseInt(points[1]));

        }
        Collections.sort(X);
        Collections.sort(Y);
        System.out.println((X.get(0)-1) + ","+ (Y.get(0)-1));
        System.out.println((X.get(X.size()-1)+1) + ","+ (Y.get(Y.size()-1)+1));
    }
}
