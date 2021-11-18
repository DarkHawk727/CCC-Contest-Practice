import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int limit = Integer.parseInt (input.readLine ());
        int speed = Integer.parseInt (input.readLine ());
        int diff = speed - limit;
        if(diff >= 1 && diff <= 20){
            System.out.println("You are speeding and your fine is $100.");
        }
        else if(diff >= 20 && diff <= 30){
            System.out.println("You are speeding and your fine is $270.");
        }
        else if(diff >= 31){
            System.out.println("You are speeding and your fine is $500.");
        }
        else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
