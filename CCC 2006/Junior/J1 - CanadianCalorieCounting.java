import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int burger = Integer.parseInt (input.readLine ());
        int side = Integer.parseInt (input.readLine ());
        int drink = Integer.parseInt (input.readLine ());
        int dessert = Integer.parseInt (input.readLine ());
        int sum = 0;
        if(burger == 1){
            sum += 461;
        }
        else if(burger == 2){
            sum += 431;
        }
        else if(burger == 3){
            sum += 420;
        }
        else if(burger == 4){
            sum += 0;
        }

        if(side == 1){
            sum += 100;
        }
        else if(side == 2){
            sum += 57;
        }
        else if(side == 3){
            sum += 70;
        }
        else if(side == 4){
            sum += 0;
        }

        if(drink == 1){
            sum += 130;
        }
        else if(drink == 2){
            sum += 160;
        }
        else if(drink == 3){
            sum += 118;
        }
        else if(drink == 4){
            sum += 0;
        }

        if(dessert == 1){
            sum += 167;
        }
        else if(dessert == 2){
            sum += 266;
        }
        else if(dessert == 3){
            sum += 75;
        }
        else if(dessert == 4){
            sum += 0;
        }
        System.out.println("Your total Calorie count is " + sum + ".");
    }
}
