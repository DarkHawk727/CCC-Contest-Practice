package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> temperatures = new ArrayList<>();
        HashMap<Integer, String> values = new HashMap<>();
        String X = "";

        while (!X.contains("Waterloo")) {
            X = String.valueOf(input.readLine());
            values.put(Integer.parseInt(X.substring((X.indexOf(" ") + 1))), X.substring(0, (X.indexOf(" "))));
            temperatures.add(Integer.parseInt(X.substring((X.indexOf(" ") + 1))));

        }
        Collections.sort(temperatures);
        System.out.println(values.get(temperatures.get(0)));

    }
}

