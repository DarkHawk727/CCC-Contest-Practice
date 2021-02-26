package com.company;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        double  daytime= Double.parseDouble(input.readLine());
        double  evening= Double.parseDouble(input.readLine());
        double  weekend= Double.parseDouble(input.readLine());
        double A = 0.00;
        double B = 0.00;
        if(daytime > 100){
            A = (0.25 * (daytime - 100)) + (0.15 * evening) + (0.2 * weekend);
        }
        else{
            A = (0.15 * evening) + (0.2 * weekend);
        }
        if(daytime > 250){
            B += (0.45 * (daytime - 250)) + (0.35 * evening) + (0.25 * weekend);
        }
        else{
            B = (0.35 * evening) + (0.25 * weekend);
        }
        String strDoubleA = String.format("%.2f", A);
        String strDoubleB = String.format("%.2f", B);
        System.out.println("Plan A costs " + strDoubleA);
        System.out.println("Plan B costs " + strDoubleB);
        if(A > B){
            System.out.println("Plan B is cheapest.");
        }
        else if(A < B){
            System.out.println("Plan A is cheapest.");
        }
        else{
            System.out.println("Plan A and B are the same price.");
        }
    }
}
