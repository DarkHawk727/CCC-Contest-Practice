import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        double weight = Double.parseDouble ( input.readLine () );
        double height = Double.parseDouble ( input.readLine () );
        double ans = weight / (height * height);
        if(ans > 25){
            System.out.println("Overweight");
        }
        else if(ans >= 18.5){
            System.out.println("Normal weight");
        }
        else if (ans < 18.5){
            System.out.println("Underweight");
        }
    }
}
