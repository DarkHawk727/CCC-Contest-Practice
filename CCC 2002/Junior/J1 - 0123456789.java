//NOTE: for DMOJ a space can never be the last character of any line.
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        if (n == 0) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println();
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
        } else if (n == 1) {
            System.out.println();
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println();
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println();
            
        } else if (n == 2) {
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println(" * * *");
            
        } else if (n == 3) {
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");

        } else if (n == 4) {
            System.out.println();
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println();

        } else if (n == 5) {
            System.out.println(" * * *");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");

        } else if (n == 6) {
            System.out.println(" * * *");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");

        } else if (n == 7) {
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println();
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println();

        } else if (n == 8) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
        } else if (n == 9) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
            
        }
    }
}
