import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int antennas = Integer.parseInt(input.readLine());
        int eyes = Integer.parseInt(input.readLine());
        if (antennas >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (antennas <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antennas <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }

    }
}
