import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> X = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String childGenome;

        String motherGenome = String.valueOf(input.readLine());
        String fatherGenome = String.valueOf(input.readLine());

        int numberOfChildren = Integer.parseInt(input.readLine());
        for (int i = 0; i < numberOfChildren; i++) {
            childGenome = String.valueOf(input.readLine());
            if (Maury(motherGenome, fatherGenome, childGenome)) {
                X.add("Possible Baby.");
            } else {
                X.add("Not their baby!");
            }
        }
        for(String i: X){
            System.out.println(i);
        }
    }

    public static boolean Maury(String motherGenome, String fatherGenome, String childGenome) {
        boolean areYouTheParents = true;
        for (int i = 0; i <= 4 && areYouTheParents; i++) {
            if (childGenome.charAt(i) >= 'A' && childGenome.charAt(i) <= 'E') {
                areYouTheParents = (motherGenome.charAt(i * 2) >= 'A' && motherGenome.charAt(i * 2) <= 'E') ||
                        (motherGenome.charAt(i * 2 + 1) >= 'A' && motherGenome.charAt(i * 2 + 1) <= 'E') ||
                        (fatherGenome.charAt(i * 2) >= 'A' && fatherGenome.charAt(i * 2) <= 'E') ||
                        (fatherGenome.charAt(i * 2 + 1) >= 'A' && fatherGenome.charAt(i * 2 + 1) <= 'E');
            } else {
                areYouTheParents = ((motherGenome.charAt(i * 2) >= 'a' && motherGenome.charAt(i * 2) <= 'e') ||
                        (motherGenome.charAt(i * 2 + 1) >= 'a' && motherGenome.charAt(i * 2 + 1) <= 'e')) &&
                        ((fatherGenome.charAt(i * 2) >= 'a' && fatherGenome.charAt(i * 2) <= 'e') ||
                                (fatherGenome.charAt(i * 2 + 1) >= 'a' && fatherGenome.charAt(i * 2 + 1) <= 'e'));
            }
        }
        return areYouTheParents;
    }
}
