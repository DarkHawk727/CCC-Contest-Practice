import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String X = String.valueOf(input.readLine());
        String M = String.valueOf(input.readLine());
        BigInteger bigint = new BigInteger(X);
        BigInteger bigint2 = new BigInteger(M);
        
        try{
            BigInteger result = bigint.modInverse(bigint2);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("No such integer exists.");
        }

    }
}
