import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int count = 0;
        int X = Integer.parseInt (input.readLine ());
        int Y = Integer.parseInt (input.readLine ());
        BigInteger numerator = BigInteger.valueOf(X);
        BigInteger denominator = BigInteger.valueOf(Y);
        BigInteger gcd = numerator.gcd(denominator);
        int GCD = gcd.intValue();
        int finalnum = X / GCD;
        int finalden = Y / GCD;
        if(Y /GCD == 1){
            System.out.println(X / GCD);
        }
        else if(finalnum > finalden){
            while(finalnum > finalden){
                finalnum -= finalden;
                count++;
            }
            System.out.println(count + " " + finalnum + "/" + finalden);
        }
        else{
            System.out.println(finalnum + "/" + finalden);
        }
    }
}
