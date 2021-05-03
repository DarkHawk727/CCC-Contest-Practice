import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> villages = new ArrayList<>();
        ArrayList<Double> distances = new ArrayList<>();
        double temp1;
        double temp2;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        for (int i = 0; i < N; i++) {
            villages.add(Integer.parseInt(input.readLine()));
        }

        Collections.sort(villages);

        for (int i = 1; i < N - 1; i++) {
            temp1 = (villages.get(i + 1) - villages.get(i)) / 2.0;
            temp2 = (villages.get(i) - villages.get(i - 1)) / 2.0;
            distances.add(temp1 + temp2);

        }

        Collections.sort(distances);
        System.out.format("%.1f", distances.get(0));

    }
}
